package com.tp1.tp1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.tp1.tp1.model.Calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/calculadora")
public class CalculatorController {
    // adição
    @GetMapping("/somar")
    public double getSoma(
            @RequestParam(defaultValue = "0") double numero1,
            @RequestParam(defaultValue = "0") double numero2) {
        return numero1 + numero2;
    }

    @PostMapping("/somar")
    public double postSoma(@RequestBody Calculator calculator) {
        return calculator.getNumber1() + calculator.getNumber2();
    }
}