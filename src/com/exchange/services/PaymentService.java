package com.exchange.services;

import com.exchange.Payment;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {
    private List<Payment> payments;

    public PaymentService() {
        payments = new ArrayList<>();
    }

    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public Payment getPaymentById(int paymentId) {
        for (Payment payment : payments) {
            if (payment.getPaymentId() == paymentId) {
                return payment;
            }
        }
        return null;
    }

    public List<Payment> getAllPayments() {
        return payments;
    }

}
