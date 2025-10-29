package com.nt.runner;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Politician;
import com.nt.service.IPoliticianMgmtService;

@Component
public class InMemoryDBTestRunner implements CommandLineRunner {
	
	@Autowired
	private IPoliticianMgmtService polService;

	@Override
	public void run(String... args) throws Exception {
		try {
		Politician politician = new Politician("Rahul", "Delhi", 40000.00, "INC", "STATE", 26);
		String msg = polService.registerPolitician(politician);
		System.out.println(msg);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			polService.showAllPolitician().forEach(System.out::println);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Press any key to terminate the program");
		int ch=System.in.read();   //Program wont terminate until it takes some input, To see the inMemory database, 
		System.exit(0);                 //otherwise it will be lost as soon as program terminates
	}

}
