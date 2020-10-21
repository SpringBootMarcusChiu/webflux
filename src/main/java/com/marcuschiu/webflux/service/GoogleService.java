package com.marcuschiu.webflux.service;

import com.marcuschiu.webflux.PojoRepository;
import com.marcuschiu.webflux.model.Pojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class GoogleService {

    @Autowired
    PojoRepository pojoRepository;

    public Mono<Pojo> findById(String id) {
        return pojoRepository.findById(id);
    }

    public Flux<Pojo> findAll() {
        return pojoRepository.findAll();
    }

    public Mono<Pojo> update(Pojo pojo) {
        return pojoRepository.save(pojo);
    }
}
