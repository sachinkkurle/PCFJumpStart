
package avinash.tiwari.batch.configuration;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.listener.SimpleMessageListenerContainer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.integration.amqp.inbound.AmqpInboundChannelAdapter;
import org.springframework.integration.amqp.outbound.AmqpOutboundEndpoint;
import org.springframework.integration.annotation.ServiceActivator;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.channel.NullChannel;
import org.springframework.integration.channel.QueueChannel;
import org.springframework.integration.core.MessagingTemplate;
import org.springframework.messaging.PollableChannel;

@Configuration
public class IntegrationConfiguration {

	@Bean
	public MessagingTemplate messageTemplate() {
		MessagingTemplate messagingTemplate = new MessagingTemplate(outboundRequests());

		messagingTemplate.setReceiveTimeout(60000000l);

		return messagingTemplate;
	}

	@Bean
	public DirectChannel outboundRequests() {
		return new DirectChannel();
	}

	@Bean
	@ServiceActivator(inputChannel = "outboundRequests")
	public AmqpOutboundEndpoint amqpOutboundEndpoint(AmqpTemplate template) {
		AmqpOutboundEndpoint endpoint = new AmqpOutboundEndpoint(template);

		endpoint.setExpectReply(true);
		endpoint.setOutputChannel(inboundRequests());

		endpoint.setRoutingKey("partition.requests");

		return endpoint;
	}

	@Bean
	public Queue requestQueue() {
		return new Queue("partition.requests", false);
	}

	@Bean
	@Profile("slave")
	public AmqpInboundChannelAdapter inbound(SimpleMessageListenerContainer listenerContainer) {
		AmqpInboundChannelAdapter adapter = new AmqpInboundChannelAdapter(listenerContainer);

		adapter.setOutputChannel(inboundRequests());

		adapter.afterPropertiesSet();

		return adapter;
	}

	@Bean
	public SimpleMessageListenerContainer container(ConnectionFactory connectionFactory) {
		SimpleMessageListenerContainer container =
				new SimpleMessageListenerContainer(connectionFactory);
		container.setQueueNames("partition.requests");
		container.setAutoStartup(false);

		return container;
	}

	@Bean
	public PollableChannel outboundStaging() {
		return new NullChannel();
	}

	@Bean
	public QueueChannel inboundRequests() {
		return new QueueChannel();
	}
}
