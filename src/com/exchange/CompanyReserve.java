package com.exchange;

public class CompanyReserve {
    private int currencyId;
    private String currencyName;
    private double amount;
    private String lastUpdated;


    public CompanyReserve(int currencyId, String currencyName, double amount, String lastUpdated) {
        this.currencyId = currencyId;
        this.currencyName = currencyName;
        this.amount = amount;
        this.lastUpdated = lastUpdated;
    }

    public int getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(int currencyId) {
        this.currencyId = currencyId;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "CompanyReserve{" +
                "currencyId=" + currencyId +
                ", currencyName='" + currencyName + '\'' +
                ", amount=" + amount +
                ", lastUpdated='" + lastUpdated + '\'' +
                '}';
    }
}
