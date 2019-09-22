package com.szewczyk.homework1.services;


import com.szewczyk.homework1.configuration.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("pro")
public class PakietPro extends PakietPlus{

    @Autowired
    AppConfig appConfig;

    @Override
    public Double calculatePrice() {
        //System.out.println("PakietPro");
        Double price = super.calculatePrice();
        Double rabat = Double.valueOf(appConfig.getRabat());
        return super.roundPrice(price * (1 - rabat));
    }

}
