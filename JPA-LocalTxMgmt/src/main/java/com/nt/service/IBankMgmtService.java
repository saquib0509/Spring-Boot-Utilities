package com.nt.service;

public interface IBankMgmtService {

	public String Withdrawl(long accno, double amt);
	public String Deposit(long accno, double amt);
	public String Transfer(long srcAcno, long destAcno, double amt );
}
