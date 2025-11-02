package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EMployeeMgmtServiceImpl implements IEmployeeMgmtService {

	@Autowired
	private IEmployeeRepository empRepo;
	
	@Override
	public String registerEmployee(Employee emp) {
		int idVal = empRepo.save(emp).getEmpno();
		return "Employee saved with id: "+idVal;
	}

	@Override
	public List<Employee> showEmployee() {
		return empRepo.findAll();
		
	}

}
