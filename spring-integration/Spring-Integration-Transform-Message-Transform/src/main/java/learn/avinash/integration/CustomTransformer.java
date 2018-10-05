package learn.avinash.integration;

import org.springframework.messaging.Message;

public class CustomTransformer {
	public String Trasnform(Message<String> message)
	{
		String[] tokens = message.getPayload().split(" ");
		return tokens[0] + " ," + tokens[1];
	}

}
