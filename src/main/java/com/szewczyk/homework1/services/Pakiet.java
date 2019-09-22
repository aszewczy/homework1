package com.szewczyk.homework1.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public interface Pakiet {

    public Double calculatePrice();
    public Double roundPrice(Double price);

}
