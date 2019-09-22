package com.szewczyk.homework1.controller;

import com.szewczyk.homework1.model.Produkt;
import com.szewczyk.homework1.services.ProduktService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StartController {

    ProduktService produktService;

    @Autowired
    public StartController(ProduktService produktService) {
        this.produktService = produktService;
    }

    @GetMapping
    public List<Produkt> getProducts(){
        return produktService.getList();
    }

}
