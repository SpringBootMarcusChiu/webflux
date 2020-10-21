package com.marcuschiu.webflux;

import com.marcuschiu.webflux.model.Pojo;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface PojoRepository extends ReactiveCrudRepository<Pojo, String> {
    Flux<Pojo> findAll();
    Mono<Pojo> findById(String id);
}
