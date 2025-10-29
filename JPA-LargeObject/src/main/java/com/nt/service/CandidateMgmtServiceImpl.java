package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Candidate;
import com.nt.repository.ICandidateRepository;


@Service
public class CandidateMgmtServiceImpl implements ICandidateMgmtService {

	@Autowired
	private ICandidateRepository canRepo;


	@Override
	public String registerCandidate(Candidate cid) {
		int idVal = canRepo.save(cid).getCid();
		return "Candidate is registered with id: "+ idVal;
	}
	
	
	

}
