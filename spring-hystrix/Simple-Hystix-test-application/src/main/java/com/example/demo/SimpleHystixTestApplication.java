package com.example.demo;
import java.net.*;
import java.io.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleHystixTestApplication {

	public static void main(String[] args) throws Exception {
		int count;
		for(count = 0; count <= 60;count++) {  // Use braces to indicate what's in the loop
			String urlString = "http://localhost:8080/recommended";
		    
		    // create the url
		    URL url = new URL(urlString);
		    
		    // open the url stream, wrap it an a few "readers"
		    BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

		    // write the output to stdout
		    String line;
		    while ((line = reader.readLine()) != null)
		    {
		   //   System.out.println(line);
		    }

		    // close our reader
		    reader.close();

		}
		 
		
		
		
		SpringApplication.run(SimpleHystixTestApplication.class, args);
	}
}
