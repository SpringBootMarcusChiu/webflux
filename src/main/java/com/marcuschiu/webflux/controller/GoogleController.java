package com.marcuschiu.webflux.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/google")
public class GoogleController {

    // is a non-blocking RestTemplate
    private final WebClient client = WebClient.create("https://www.google.com");

    @GetMapping()
    public Mono<String> home() {
		Mono<String> mono = client.get()
				.uri("/")
				.retrieve()
				.bodyToMono(String.class);
		return mono;
    }
}
