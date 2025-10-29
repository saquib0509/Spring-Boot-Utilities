package com.nt.service;

import java.util.List;

import com.nt.entity.Politician;

public interface IPoliticianMgmtService {
	public String registerPolitician(Politician politician);
	public List<Politician> showAllPolitician();
}
