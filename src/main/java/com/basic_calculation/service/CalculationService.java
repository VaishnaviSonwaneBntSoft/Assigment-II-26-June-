package com.basic_calculation.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.basic_calculation.components.ArmstrongTask;
import com.basic_calculation.components.CubeTask;
import com.basic_calculation.components.EvenOddTask;
import com.basic_calculation.components.FactorialTask;
import com.basic_calculation.components.PalidromeTask;
import com.basic_calculation.components.PrimeTask;
import com.basic_calculation.components.ReverseTask;
import com.basic_calculation.components.SqaureTask;

@Service
public class CalculationService{
    @Autowired
    SqaureTask sqaureTask;

    @Autowired
    CubeTask cubeTask;

    @Autowired
    EvenOddTask evenOddTask;

    @Autowired
    PrimeTask primeTask;

    @Autowired
    ArmstrongTask armstrongTask;

    @Autowired
    PalidromeTask palidromeTask;

    @Autowired
    FactorialTask factorialTask;

    @Autowired
    ReverseTask reversetask;

    public Map<String , Object> performCalculations(int number) throws InterruptedException{

        Map<String , Object> map = new HashMap<>();

        sqaureTask.setNumber(number);
        Thread sqaureThread = new Thread(sqaureTask);
        sqaureThread.start();
        sqaureThread.join();
        map.put("Square", sqaureTask.getResult());

        cubeTask.setNumber(number);
        Thread cubeThread = new Thread(cubeTask);
        cubeThread.start();
        cubeThread.join();
        map.put("Cube", cubeTask.getResult());

        evenOddTask.setNumber(number);
        Thread evenoddThread = new Thread(evenOddTask);
        evenoddThread.start();
        evenoddThread.join();
        map.put("Even Or Odd", evenOddTask.getResult());

        primeTask.setNumber(number);
        Thread primeThread = new Thread(primeTask);
        primeThread.start();
        primeThread.join();
        map.put("Prime Or Not", primeTask.getResult());

        armstrongTask.setNumber(number);
        Thread armstrongThread = new Thread(armstrongTask);
        armstrongThread.start();
        armstrongThread.join();
        map.put("ArmStrong Or Not", armstrongTask.getResult());

        palidromeTask.setNumber(number);
        Thread palidromeThread = new Thread(palidromeTask);
        palidromeThread.start();
        palidromeThread.join();
        map.put("Palidrome Or Not", palidromeTask.getResult());

        factorialTask.setNumber(number);
        Thread factorialThread = new Thread(factorialTask);
        factorialThread.start();
        factorialThread.join();
        map.put("Factorial ", factorialTask.getResult());

        reversetask.setNumber(number);
        Thread reverseThread = new Thread(reversetask);
        reverseThread.start();
        reverseThread.join();
        map.put("Reverse ", reversetask.getResult());

       return map;
    }

    
}
