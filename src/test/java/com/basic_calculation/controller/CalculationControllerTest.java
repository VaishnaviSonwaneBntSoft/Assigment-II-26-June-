package com.basic_calculation.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.basic_calculation.service.CalculationService;

public class CalculationControllerTest {

    @Mock
    private CalculationService calculationServiceMock;

    @InjectMocks
    private CalculationController calculationController;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    
    @Test
    public void testCalculate_Success() throws InterruptedException {
        int number = 10;
        Map<String, Object> expectedResult = new HashMap<>();
        expectedResult.put("Square", 100);
        expectedResult.put("Cube", 1000);
        expectedResult.put("Even Or Odd", "Even");
        expectedResult.put("Prime Or Not", "Prime");
        expectedResult.put("ArmStrong Or Not", "Armstrong");
        expectedResult.put("Palidrome Or Not", "Palindrome");
        expectedResult.put("Factorial ", 3628800);
        expectedResult.put("Reverse ", 1);

        when(calculationServiceMock.performCalculations(number)).thenReturn(expectedResult);

        ResponseEntity<Map<String, Object>> responseEntity = calculationController.calculate(number);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(expectedResult, responseEntity.getBody());
    }


    @Test
    public void testCalculate_Error() throws InterruptedException {
        int number = 10;

        when(calculationServiceMock.performCalculations(number)).thenThrow(new RuntimeException("Mocked error"));

        ResponseEntity<Map<String, Object>> responseEntity = calculationController.calculate(number);

        assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, responseEntity.getStatusCode());
        assertNull(responseEntity.getBody());
    }
}

