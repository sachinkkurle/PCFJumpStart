package learn.avinash.integration;

import java.util.Map.Entry;

import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;

public class PrintService {

	public Message<?> print(Message<String> message) {
		MessageHeaders messageheader = message.getHeaders();
		for (Entry<String, Object> entry : messageheader.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

		System.out.println(message.getPayload());

		return MessageBuilder.withPayload("New message Build").build();
	}

}
