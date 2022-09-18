package com.example.demo.contoller;

import com.example.demo.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculator")
public class FirstController {

    private final CalculatorService calculatorService;

    public FirstController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    String showCalculator() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    String showCalculatorPlus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getRequestPlus(num1,num2);
    }

    @GetMapping("/minus")
    String showCalculatorMinus(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " + " + num2 + " = " + calculatorService.getRequestMinus(num1,num2);
    }

    @GetMapping("/multiply")
    String showCalculatorMultiply(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " * " + num2 + " = " + calculatorService.getRequestMultiply(num1,num2);
    }

    @GetMapping("/divide")
    String showCalculatorDivide(@RequestParam int num1, @RequestParam int num2) {
        return num1 + " / " + num2 + " = " + calculatorService.getRequestDivide(num1,num2);
    }
}
