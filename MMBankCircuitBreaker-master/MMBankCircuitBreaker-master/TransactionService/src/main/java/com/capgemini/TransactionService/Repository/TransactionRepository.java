package com.capgemini.TransactionService.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.TransactionService.entity.Transaction;



@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{

}