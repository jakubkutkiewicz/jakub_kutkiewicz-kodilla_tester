package com.kodilla.spring.basic.spring_scopes;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    LocalTime localTime = LocalTime.now();

    public LocalTime Clock() {
        return this.localTime;


    }
}
