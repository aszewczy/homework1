package com.szewczyk.homework1.services;


import com.szewczyk.homework1.model.Produkt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProduktService {

    Pakiet pakiet;

    private List<Produkt> productList;

    @Autowired
    public ProduktService(Pakiet pakiet) {
        Produkt p1 =new Produkt("Buty", pakiet.calculatePrice());
        Produkt p2 =new Produkt("Spodnie", pakiet.calculatePrice());
        Produkt p3 =new Produkt("Czapka", pakiet.calculatePrice());
        Produkt p4 =new Produkt("Koszulka", pakiet.calculatePrice());
        Produkt p5 =new Produkt("Zegarek", pakiet.calculatePrice());
        productList = new ArrayList<Produkt>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.forEach(System.out::println);
    }

    public List<Produkt> getList(){
        return productList;
    }



}
