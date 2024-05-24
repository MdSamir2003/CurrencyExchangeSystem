package com.exchange;

public class Payment {
    private int paymentId;
    private int transactionId;
    private int paymentMethodId;
    private double amount;
    private String paymentDate;
    private String status;


    public Payment(int paymentId, int transactionId, int paymentMethodId, double amount, String paymentDate, String status) {
        this.paymentId = paymentId;
        this.transactionId = transactionId;
        this.paymentMethodId = paymentMethodId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.status = status;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Payment{" +
                "paymentId=" + paymentId +
                ", transactionId=" + transactionId +
                ", paymentMethodId=" + paymentMethodId +
                ", amount=" + amount +
                ", paymentDate='" + paymentDate + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
