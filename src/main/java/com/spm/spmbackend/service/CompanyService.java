package com.spm.spmbackend.service;

import java.util.List;
import com.spm.spmbackend.model.Company;

public interface CompanyService {
	
	List<Company> getCompany();
	Company addCompany(Company c);
	Company getCompanyByID(String id);
	
}
