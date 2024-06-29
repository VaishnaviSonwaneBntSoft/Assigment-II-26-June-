package com.basic_calculation.components;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ArmstrongTask implements Runnable{
    private int number;
    private String result;
    
    public void setNumber(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        log.info("Checking Number Is ArmStrong Or Not");
        int tempNumber = number;
        int sumOfDigit=0;
        while(tempNumber>0)
        {
            int remender = tempNumber%10;
            sumOfDigit += remender*remender*remender;
            tempNumber = tempNumber/10;
        }

        if(sumOfDigit==number)
            result="Given Number Is ArmStrong";
        else
            result="Given Number Is Not ArmStrong";
    }

    public String getResult()
    {
        return result;
    }
}