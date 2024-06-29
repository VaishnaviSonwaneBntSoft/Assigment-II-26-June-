package com.basic_calculation.components;

import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@NoArgsConstructor
public class FactorialTask implements Runnable{
    private int number;
    private int result;
    
    public void setNumber(int number) {
        this.number=number;
    }

    @Override
    public void run() {
        log.info("Calculating Factorial of {}",number);
        int factorial=1;
        while(number>0)
        {
            int remender = number%10;
            factorial *= remender;
            number = number/10;
        }
        result=factorial;
        log.info("Factorial of {} is {}", number,result);
    }

    public int getResult()
    {
        return result;
    }

}