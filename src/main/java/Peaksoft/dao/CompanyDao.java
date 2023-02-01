package Peaksoft.dao;

import Peaksoft.entity.Company;

import java.util.List;

public interface CompanyDao {
    String saveCompany(Company companies);
    List<Company> getAllCompanies();
    String updateCompany(Long id, Company newCompany);
    String deleteCompanyById(Long id);
}
