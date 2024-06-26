package com.basic_calculation.components;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class EvenOddTask implements Runnable{
    private int number;
    private String result;
    
    public void setNumber(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        log.info("Checking Number Is Even Or Not");
        if(number%2==0)
            result="Given Number Is Even";
        else
             result="Given Number Is Odd";
    }

    public String getResult()
    {
        return result;
    }
}