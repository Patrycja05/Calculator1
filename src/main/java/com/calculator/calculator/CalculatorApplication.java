package com.calculator.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum1 = calculator.sum(4, 6);
        System.out.println(sum1);
    }
}
