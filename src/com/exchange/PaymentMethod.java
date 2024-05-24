package com.exchange;

public class PaymentMethod {
    private int paymentMethodId;
    private String methodName;
    private double transactionFee;
    private String processingTime;


    public PaymentMethod(int paymentMethodId, String methodName, double transactionFee, String processingTime) {
        this.paymentMethodId = paymentMethodId;
        this.methodName = methodName;
        this.transactionFee = transactionFee;
        this.processingTime = processingTime;
    }

    public int getPaymentMethodId() {
        return paymentMethodId;
    }

    public void setPaymentMethodId(int paymentMethodId) {
        this.paymentMethodId = paymentMethodId;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public double getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(double transactionFee) {
        this.transactionFee = transactionFee;
    }

    public String getProcessingTime() {
        return processingTime;
    }

    public void setProcessingTime(String processingTime) {
        this.processingTime = processingTime;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "paymentMethodId=" + paymentMethodId +
                ", methodName='" + methodName + '\'' +
                ", transactionFee=" + transactionFee +
                ", processingTime='" + processingTime + '\'' +
                '}';
    }
}
