package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDateTime;

@Configuration
public class ConfigCar {
    LocalDateTime date = LocalDateTime.now();


    @Bean
    public Car createCar() {
        Car car;
        if (date.getMonthValue() < 3 || date.getMonthValue() == 12) {
            car = new SUV();
        } else if (date.getMonthValue() >= 6 && date.getMonthValue() <= 8) {
            car = new Cabrio();
        } else
            car = new Sedan();
        return car;
    }


}


