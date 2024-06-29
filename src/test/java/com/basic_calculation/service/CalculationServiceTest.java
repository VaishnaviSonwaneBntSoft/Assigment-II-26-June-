package com.basic_calculation.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.Map;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.basic_calculation.components.*;

public class CalculationServiceTest {

    @Mock
    private SqaureTask sqaureTaskMock;

    @Mock
    private CubeTask cubeTaskMock;

    @Mock
    private EvenOddTask evenOddTaskMock;

    @Mock
    private PrimeTask primeTaskMock;

    @Mock
    private ArmstrongTask armstrongTaskMock;

    @Mock
    private PalidromeTask palidromeTaskMock;

    @Mock
    private FactorialTask factorialTaskMock;

    @Mock
    private ReverseTask reverseTaskMock;

    @InjectMocks
    private CalculationService calculationService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    
    @Test
    public void testPerformCalculations() throws InterruptedException {
        int number = 5;

     
        when(sqaureTaskMock.getResult()).thenReturn(number * number);
        when(cubeTaskMock.getResult()).thenReturn(number * number * number);
        when(evenOddTaskMock.getResult()).thenReturn("Odd");
        when(primeTaskMock.getResult()).thenReturn("Prime");
        when(armstrongTaskMock.getResult()).thenReturn("Armstrong");
        when(palidromeTaskMock.getResult()).thenReturn("Palindrome");
        when(factorialTaskMock.getResult()).thenReturn(120); 
        when(reverseTaskMock.getResult()).thenReturn(5); 

        Map<String, Object> result = calculationService.performCalculations(number);

        assertEquals(number * number, result.get("Square"));
        assertEquals(number * number * number, result.get("Cube"));
        assertEquals("Odd", result.get("Even Or Odd"));
        assertEquals("Prime", result.get("Prime Or Not"));
        assertEquals("Armstrong", result.get("ArmStrong Or Not"));
        assertEquals("Palindrome", result.get("Palidrome Or Not"));
        assertEquals(120, result.get("Factorial "));
        assertEquals(5, result.get("Reverse "));
    }
}

