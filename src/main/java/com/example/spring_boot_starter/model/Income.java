package com.example.spring_boot_starter.model;

public class Income {

    private long userId;

    private double income;

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public Income() {
    }

    public Income(Long userId, double income) {
        this.userId = userId;
        this.income = income;
    }

}
