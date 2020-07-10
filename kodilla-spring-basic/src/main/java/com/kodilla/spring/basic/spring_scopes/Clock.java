package com.kodilla.spring.basic.spring_scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {


    public Clock() {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);


    }
}
