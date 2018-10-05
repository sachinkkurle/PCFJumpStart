package com.avinash.learn.webflux.web;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.avinash.learn.webflux.model.Quote;
import com.avinash.learn.webflux.service.QuoteGeneratorService;

import reactor.core.publisher.Mono;
import static org.springframework.web.reactive.function.server.ServerResponse.ok;

import java.time.Duration;

import org.springframework.http.MediaType;

@Component
public class QuoteHandler {
	private final QuoteGeneratorService quoteGeneratorService;

	
	public QuoteHandler(QuoteGeneratorService quoteGeneratorService) {
		this.quoteGeneratorService = quoteGeneratorService;
	}
	
	public Mono<ServerResponse> fetchQuotes(ServerRequest request)
	{
		int size = Integer.parseInt(request.queryParam("size").orElse("10"));
		
		return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(this.quoteGeneratorService.fetchQuoteStream(Duration.ofMillis(100))
                        .take(size), Quote.class);
	}
	
	public Mono<ServerResponse> streamQuotes(ServerRequest request) {
        int size = Integer.parseInt(request.queryParam("size").orElse("10"));

        return ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(this.quoteGeneratorService.fetchQuoteStream(Duration.ofMillis(200))
                        .take(size), Quote.class);
    }
}
