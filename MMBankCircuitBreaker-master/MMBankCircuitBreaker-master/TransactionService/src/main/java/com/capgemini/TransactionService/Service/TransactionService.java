package com.capgemini.TransactionService.Service;

import java.util.List;

import com.capgemini.TransactionService.entity.Transaction;

public interface TransactionService {

	List<Transaction> listOfTransactions();

	double deposit(Integer accountNumber, Double amount, double currentBalance, String deposit);

	double withdraw(Integer accountNumber, Double amount, double currentBalance, String withdraw);

}
