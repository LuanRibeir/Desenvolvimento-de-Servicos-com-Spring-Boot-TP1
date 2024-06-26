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

    // subtração
    @GetMapping("/subtrair")
    public double getSubtrair(
            @RequestParam(defaultValue = "0") double numero1,
            @RequestParam(defaultValue = "0") double numero2) {
        return numero1 - numero2;
    }

    @PostMapping("/subtrair")
    public double postSubtrair(@RequestBody Calculator calculator) {
        return calculator.getNumber1() - calculator.getNumber2();
    }

    // multiplicação
    @GetMapping("/multiplicar")
    public double getMultiplicar(
            @RequestParam(defaultValue = "0") double numero1,
            @RequestParam(defaultValue = "0") double numero2) {
        return numero1 * numero2;
    }

    @PostMapping("/multiplicar")
    public double postMultiplicar(@RequestBody Calculator calculator) {
        return calculator.getNumber1() * calculator.getNumber2();
    }

    // divisão
    @GetMapping("/dividir")
    public double getDividir(
            @RequestParam(defaultValue = "0") double numero1,
            @RequestParam(defaultValue = "0") double numero2) {
        return numero1 / numero2;
    }

    @PostMapping("/dividir")
    public double postDividir(@RequestBody Calculator calculator) {
        return calculator.getNumber1() / calculator.getNumber2();
    }

    // exponenciação
    @GetMapping("/elevar")
    public double getElevar(
            @RequestParam(defaultValue = "0") double numero1,
            @RequestParam(defaultValue = "0") double numero2) {
        return Math.pow(numero1, numero2);
    }

    @PostMapping("/elevar")
    public double postElevar(@RequestBody Calculator calculator) {
        return Math.pow(calculator.getNumber1(), calculator.getNumber2());
    }
}