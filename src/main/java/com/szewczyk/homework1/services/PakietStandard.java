package com.szewczyk.homework1.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import java.util.concurrent.ThreadLocalRandom;

@Service
@Profile("standard")
public class PakietStandard implements Pakiet{

    @Override
    public Double calculatePrice() {
       // System.out.println("PakietStandard");
        double min = 50;
        double max = 300;
        double random = ThreadLocalRandom.current().nextDouble(min, max);
        return roundPrice(random);
    }

    @Override
    public Double roundPrice(Double price) {
        double roundPrice = (double) Math.round(price * 100) / 100;
        return roundPrice;
    }
}
