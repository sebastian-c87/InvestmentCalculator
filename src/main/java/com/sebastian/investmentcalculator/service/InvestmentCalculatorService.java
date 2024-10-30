package com.sebastian.investmentcalculator.service;

import com.sebastian.investmentcalculator.model.InvestmentParameters;
import com.sebastian.investmentcalculator.model.InvestmentResult;
import org.springframework.stereotype.Service;

@Service
public class InvestmentCalculatorService {
    public InvestmentResult calculateInvestment(InvestmentParameters params) {
        // Implementacja logiki obliczeń
        InvestmentResult result = new InvestmentResult();

        // Pobranie parametrów
        double initialAmount = params.getInitialAmount();
        double regularContribution = params.getRegularContribution();
        double annualInterestRate = params.getAnnualInterestRate() / 100; // Konwersja z procentów
        double inflationRate = params.getInflationRate() / 100;
        double fees = params.getFees() / 100;
        int investmentPeriod = params.getInvestmentPeriod();

        int n = switch (params.getCompoundingFrequency()) {
            case "QUARTERLY" -> 4;
            case "MONTHLY" -> 12;
            case "DAILY" -> 365;
            default -> 1;
        }; // liczba kapitalizacji w roku

        // Uwzględnienie opłat
        double effectiveInterestRate = annualInterestRate - fees;

        // Obliczenia
        double compoundInterestFactor = Math.pow(1 + (effectiveInterestRate / n), n * investmentPeriod);
        double futureValueLumpSum = initialAmount * compoundInterestFactor;

        double futureValueAnnuity = 0;
        if (regularContribution > 0) {
            futureValueAnnuity = regularContribution * ((compoundInterestFactor - 1) / (effectiveInterestRate / n));
        }

        double futureValue = futureValueLumpSum + futureValueAnnuity;

        // Dostosowanie o inflację
        double adjustedForInflation = futureValue / Math.pow(1 + inflationRate, investmentPeriod);

        // Całkowite wpłaty
        double totalContributions = initialAmount + regularContribution * n * investmentPeriod;

        // Całkowity zysk
        double totalInterestEarned = futureValue - totalContributions;

        // Ustawienie wyników
        result.setFutureValue(futureValue);
        result.setAdjustedForInflation(adjustedForInflation);
        result.setTotalContributions(totalContributions);
        result.setTotalInterestEarned(totalInterestEarned);

        return result;
    }
}
