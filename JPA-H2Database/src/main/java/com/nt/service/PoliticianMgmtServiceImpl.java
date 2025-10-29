package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Politician;
import com.nt.repository.IPoliticianRepository;

@Service
public class PoliticianMgmtServiceImpl implements IPoliticianMgmtService {

	@Autowired
	private IPoliticianRepository polRepo;
	
	@Override
	public String registerPolitician(Politician politician) {
		int idVal = polRepo.save(politician).getId();
		return "Data saved with id: " + idVal;
	}

	@Override
	public List<Politician> showAllPolitician() {
		return polRepo.findAll();
	}

}
