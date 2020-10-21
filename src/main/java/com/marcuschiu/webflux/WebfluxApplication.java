package com.marcuschiu.webflux;

import com.marcuschiu.webflux.model.Pojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@SpringBootApplication
public class WebfluxApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(WebfluxApplication.class, args);
	}

	// TODO repository layer needs working
	// see: https://thepracticaldeveloper.com/full-reactive-stack-2-backend-webflux/#repository-layer
	@Override
	public void run(String... args) throws Exception {
		// CLIENT
//		WebClient client = WebClient.create("http://localhost:8080");
//
//		Mono<Pojo> pojoMono = client.get()
//				.uri("/pojo/{id}", "1")
//				.retrieve()
//				.bodyToMono(Pojo.class);
//		pojoMono.subscribe(System.out::println);
//
//		Flux<Pojo> pojoFlux = client.get()
//				.uri("/pojos")
//				.retrieve()
//				.bodyToFlux(Pojo.class);
//		pojoFlux.subscribe(System.out::println);
	}
}
