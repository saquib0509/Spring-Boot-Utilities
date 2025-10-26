package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.service.IBankMgmtService;

@Component
public class LocalTxMgmtRunner implements CommandLineRunner {

	@Autowired
	private IBankMgmtService bankService;
	
	@Override
	public void run(String... args) throws Exception {
		
		try
		{
			String msg = bankService.Transfer(100001, 100002, 3000);
			System.out.println(msg);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		 
	}

}
