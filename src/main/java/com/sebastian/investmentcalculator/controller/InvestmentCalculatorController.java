package com.sebastian.investmentcalculator.controller;

import com.sebastian.investmentcalculator.model.InvestmentParameters;
import com.sebastian.investmentcalculator.model.InvestmentResult;
import com.sebastian.investmentcalculator.service.InvestmentCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/investment")
public class InvestmentCalculatorController {
    private final InvestmentCalculatorService calculatorService;

    @Autowired
    public InvestmentCalculatorController(InvestmentCalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @PostMapping("/calculate")
    public ResponseEntity<InvestmentResult> calculateInvestment(@Valid @RequestBody InvestmentParameters params) {
        InvestmentResult result = calculatorService.calculateInvestment(params);
        return ResponseEntity.ok(result);
    }
}
