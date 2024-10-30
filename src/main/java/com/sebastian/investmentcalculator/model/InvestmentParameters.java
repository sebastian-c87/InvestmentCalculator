package com.sebastian.investmentcalculator.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class InvestmentParameters {

    @Min(0)
    private double initialAmount;

    @Min(0)
    private double regularContribution;

    @Min(0)
    private double annualInterestRate;

    @Min(1)
    private int investmentPeriod; // w latach

    @NotNull
    @Pattern(regexp = "ANNUAL|QUARTERLY|MONTHLY|DAILY")
    private String compoundingFrequency;

    @Min(0)
    private double inflationRate;

    @Min(0)
    private double fees;


    // Gettery i settery
    public double getInitialAmount() {
        return initialAmount;
    }

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public double getRegularContribution() {
        return regularContribution;
    }

    public void setRegularContribution(double regularContribution) {
        this.regularContribution = regularContribution;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getInvestmentPeriod() {
        return investmentPeriod;
    }

    public void setInvestmentPeriod(int investmentPeriod) {
        this.investmentPeriod = investmentPeriod;
    }

    public String getCompoundingFrequency() {
        return compoundingFrequency;
    }

    public void setCompoundingFrequency(String compoundingFrequency) {
        this.compoundingFrequency = compoundingFrequency;
    }

    public double getInflationRate() {
        return inflationRate;
    }

    public void setInflationRate(double inflationRate) {
        this.inflationRate = inflationRate;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

}
