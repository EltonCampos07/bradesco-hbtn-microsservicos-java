package com.example.calculator.controller;

import com.example.calculator.model.Calculator;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping(value = "/calculator")
public class CalculatorController {

    @GetMapping("/welcome")
    public String messageWelcome() {
        return "Bem vindo à CALCULATOR API REST.";
    }

    @GetMapping("/addNumbers")
    public String addNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        try {
            var calculator = new Calculator();
            return String.valueOf(calculator.sum(n1, n2));
        } catch (NullPointerException e) {
            return "Erro: " + e.getMessage();
        }
    }

    @GetMapping("/subNumbers")
    public String subNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        try {
            var calculator = new Calculator();
            return String.valueOf(calculator.sub(n1, n2));
        } catch (NullPointerException e) {
            return "Erro: " + e.getMessage();
        }
    }

    @GetMapping("/divideNumbers")
    public String divideNumbers(@RequestParam(name = "number1") Double n1, @RequestParam(name = "number2") Double n2) {
        try {
            var calculator = new Calculator();
            return String.valueOf(calculator.divide(n1, n2));
        } catch (NullPointerException | ArithmeticException e) {
            return "Erro: " + e.getMessage();
        }
    }

    @GetMapping("/factorial")
    public String factorial(@RequestParam(name = "factorial") Integer factorial) {
        try {
            var calculator = new Calculator();
            return String.valueOf(calculator.factorial(factorial));
        } catch (NullPointerException e) {
            return "Erro: " + e.getMessage();
        }
    }

    @GetMapping("/calculeDayBetweenDate")
    public String calculeDayBetweenDate(
            @RequestParam("localDate1") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate1,
            @RequestParam("localDate2") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate localDate2) {
        try {
            var calculator = new Calculator();
            return String.valueOf(calculator.calculeDayBetweenDate(localDate1, localDate2));
        } catch (NullPointerException e) {
            return "Erro: " + e.getMessage();
        }
    }

    @GetMapping("/integerToBinary")
    public String integerToBinary(@RequestParam(name = "number1") Integer n1) {
        try {
            var calculator = new Calculator();
            return String.valueOf(calculator.integerToBinary(n1));
        } catch (NullPointerException e) {
            return "Erro: " + e.getMessage();
        }
    }

    @GetMapping("/integerToHexadecimal")
    public String integerToHexadecimal(@RequestParam(name = "number1") Integer n1) {
        try {
            var calculator = new Calculator();
            return calculator.integerToHexadecimal(n1);
        } catch (NullPointerException e) {
            return "Erro: " + e.getMessage();
        }
    }
}
