package com.basic_calculation.controller;


import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic_calculation.service.CalculationService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.RequestMapping;


@Slf4j
@RestController
@RequestMapping("/api/calculator")
public class CalculationController {
    
    @Autowired
    CalculationService calculationService;

    @PostMapping("/calculate/{number}")
    public ResponseEntity<Map<String , Object>> calculate(@PathVariable("number") int number)
    {   

        try{
            log.info("Recieved Calculation Request of number {}",number);
            Map<String , Object> map = calculationService.performCalculations(number);
            System.out.println(map);
            log.info("Calculation Completed Succesfully");
            return ResponseEntity.ok(map);
        }
        catch(Exception ex)
        {
            log.error("Error Occur During Calculations", ex.getMessage());
            return ResponseEntity.internalServerError().build();
        }
    }
}
