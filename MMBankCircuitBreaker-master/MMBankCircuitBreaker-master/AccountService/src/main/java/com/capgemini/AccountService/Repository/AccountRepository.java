package com.capgemini.AccountService.Repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.AccountService.Entity.SavingsAccount;
@Repository
public interface AccountRepository extends  MongoRepository<SavingsAccount, Integer>{
	
}
