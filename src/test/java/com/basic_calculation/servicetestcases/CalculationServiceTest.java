// package com.basic_calculation.servicetestcases;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.mockito.Mockito.timeout;
// import static org.mockito.Mockito.verify;
// import static org.mockito.Mockito.when;

// import java.util.Map;
// import org.junit.jupiter.api.Test;
// import org.junit.jupiter.api.extension.ExtendWith;
// import org.mockito.InjectMocks;
// import org.mockito.Mock;
// import org.mockito.junit.jupiter.MockitoExtension;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.test.context.SpringBootTest;
// import com.basic_calculation.components.SqaureTask;
// import com.basic_calculation.service.CalculationService;

// @ExtendWith(MockitoExtension.class)
// @SpringBootTest
// public class CalculationServiceTest {

//     @Mock
//     private SqaureTask sqaureTask;

//     @Autowired
//     private CalculationService calculationService;


//     @Test
//     public void testPerformSqaureCalculation() throws InterruptedException
//     {
//         int number=10;
//         int expectedNumber = 100;
//         sqaureTask.setNumber(number);
//         when(sqaureTask.getResult()).thenReturn(expectedNumber);

//         Map<String , Object> result = calculationService.performCalculations(number);

//         assertEquals(expectedNumber, result.get("Square"));

//         verify(sqaureTask , timeout(1)).setNumber(number);
//         verify(sqaureTask , timeout(1)).run();

//     }
// }
