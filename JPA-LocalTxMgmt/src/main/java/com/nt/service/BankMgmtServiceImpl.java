package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.BankAccount;
import com.nt.repository.IBankAccountRepository;

import jakarta.transaction.Transactional;

@Service
public class BankMgmtServiceImpl implements IBankMgmtService {

	@Autowired
	private IBankAccountRepository bankRepo;
	
	@Override
	public String Withdrawl(long accno, double amt) {
		
		BankAccount acc = bankRepo.findById(accno).orElseThrow(()-> new IllegalArgumentException( "Invalid account"));
		acc.setBalance(acc.getBalance()-amt);
		bankRepo.save(acc);
			
		return amt + " is Withdrawn from account: "+ accno;
	}

	@Override
	public String Deposit(long accno, double amt) {
		BankAccount acc = bankRepo.findById(accno).orElseThrow(()-> new IllegalArgumentException( "Invalid account"));
		acc.setBalance(acc.getBalance()+amt);
		bankRepo.save(acc);
			
		return amt + " is Deposited to account: "+ accno;
	}

	@Override
	@Transactional
	public String Transfer(long srcAcno, long destAcno, double amt) {
		Withdrawl(srcAcno, amt);
		Deposit(destAcno, amt);
		return amt + " is Transferred from account "+srcAcno+ " to "+ destAcno;
	}

}
