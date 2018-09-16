package com.spm.spmbackend.service;

import java.util.List;
import com.spm.spmbackend.model.Company;

public interface CompanyService {
	
	public List<Company> getCompany();
	public Company addCompany(Company c) ;
	
}
