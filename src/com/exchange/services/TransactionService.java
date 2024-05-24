package com.exchange.services;

import com.exchange.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TransactionService {
    private List<Transaction> transactions;

    public TransactionService() {
        transactions = new ArrayList<>();
    }

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public Transaction getTransactionById(int transactionId) {
        for (Transaction transaction : transactions) {
            if (transaction.getTransactionId() == transactionId) {
                return transaction;
            }
        }
        return null;
    }

    public List<Transaction> getAllTransactions() {
        return transactions;
    }


}
