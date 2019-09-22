package com.szewczyk.homework1.services;

import com.szewczyk.homework1.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("plus")
public class PakietPlus extends PakietStandard {

    @Autowired
    AppConfig appConfig;

    @Override
    public Double calculatePrice() {
     //   System.out.println("PakietPlus");
        Double price = super.calculatePrice();
        Double vat = Double.valueOf(appConfig.getVat());
        return super.roundPrice(price * (1 + vat ));
    }


}
