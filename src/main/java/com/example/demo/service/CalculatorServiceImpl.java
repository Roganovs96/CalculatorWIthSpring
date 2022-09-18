package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int getRequestPlus(int a, int b) {
        return a + b;
    }

    @Override
    public int getRequestMinus(int a, int b) {
        return a - b;
    }

    @Override
    public int getRequestMultiply(int a, int b) {
        return a * b;
    }

    @Override
    public int getRequestDivide(int a, int b) {
        if (b == 0)
            throw new IllegalArgumentException("Argument 'b' is 0");
        return a / b;
    }
}
