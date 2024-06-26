package com.basic_calculation.components;

import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class PrimeTask implements Runnable{
    private int number;
    private String result;
    
    public void setNumber(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        log.info("Checking Number Is Prime Or Not");
        boolean check = false;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i==0)
            {
                check=true;
                break;
            }
        }

        if(check)
            result="Given Number is Not Prime Number";
            else
            result="Given Number is Prime Number";
    }

    public String getResult()
    {
        return result;
    }
}