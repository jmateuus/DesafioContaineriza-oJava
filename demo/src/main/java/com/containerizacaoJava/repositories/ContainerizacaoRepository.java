package com.containerizacaoJava.repositories;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ContainerizacaoRepository {

    @GetMapping("/hello")
    public String motraHello(){
        return "Hello, Docker!";
    }
}
