package com.avinash.learn.webflux.service;

import reactor.core.publisher.Flux;

import java.time.Duration;

import com.avinash.learn.webflux.model.Quote;


public interface QuoteGeneratorService {

    Flux<Quote> fetchQuoteStream(Duration period);
}