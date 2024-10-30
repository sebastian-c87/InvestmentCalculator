package com.sebastian.investmentcalculator.model;

public class InvestmentResult {

    private double futureValue;
    private double adjustedForInflation;
    private double totalContributions;
    private double totalInterestEarned;

    // Gettery i settery

    public double getFutureValue() {
        return futureValue;
    }

    public void setFutureValue(double futureValue) {
        this.futureValue = futureValue;
    }

    public double getAdjustedForInflation() {
        return adjustedForInflation;
    }

    public void setAdjustedForInflation(double adjustedForInflation) {
        this.adjustedForInflation = adjustedForInflation;
    }

    public double getTotalContributions() {
        return totalContributions;
    }

    public void setTotalContributions(double totalContributions) {
        this.totalContributions = totalContributions;
    }

    public double getTotalInterestEarned() {
        return totalInterestEarned;
    }

    public void setTotalInterestEarned(double totalInterestEarned) {
        this.totalInterestEarned = totalInterestEarned;
    }
}
