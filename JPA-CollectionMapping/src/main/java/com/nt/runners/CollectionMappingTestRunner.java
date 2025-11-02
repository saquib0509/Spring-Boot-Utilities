package com.nt.runners;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeMgmtService;

@Component
public class CollectionMappingTestRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeMgmtService empService;
	
	@Override
	public void run(String... args) throws Exception {
		
//		try {
//			Employee eobj = new Employee("Aquib", "BLR",
//										List.of("Sohail", "Aman", "Taj"),
//										Set.of(67375224L, 64937643L, 257828674L),
//										Map.of("AADHAR", 960446362, "PAN", 857267356, "VOTER ID", 847383758));
//			String msg = empService.registerEmployee(eobj);
//			System.out.println(msg);
//		}
//		
//		catch (Exception e) {
//			e.printStackTrace();
//		}
		
		try {
			
			empService.showEmployee().forEach(System.out::println);;
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
