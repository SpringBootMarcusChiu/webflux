package com.marcuschiu.webflux.controller;

import com.marcuschiu.webflux.PojoRepository;
import com.marcuschiu.webflux.model.Pojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class PojoController {

    @Autowired
    PojoRepository pojoRepository;

    @GetMapping("/pojo/{id}")
    private Mono<Pojo> getEmployeeById(@PathVariable String id) {
        return pojoRepository.findById(id);
    }

    @GetMapping("/pojos")
    private Flux<Pojo> getAllPojos() {
        return pojoRepository.findAll();
    }

    @PostMapping("/pojo/update")
    private Mono<Pojo> updateEmployee(@RequestBody Pojo pojo) {
        return pojoRepository.save(pojo);
    }
}
