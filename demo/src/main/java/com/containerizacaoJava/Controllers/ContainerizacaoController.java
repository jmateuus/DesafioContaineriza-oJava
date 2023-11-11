package com.containerizacaoJava.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ContainerizacaoController {

    @GetMapping("/hello")
    public String motraHello(){
        return "Hello, Docker!";
    }
}
