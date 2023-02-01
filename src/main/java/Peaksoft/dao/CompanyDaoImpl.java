package Peaksoft.dao;

import Peaksoft.entity.Company;
import jakarta.persistence.EntityManager;

import java.util.List;

public class CompanyDaoImpl implements CompanyDao{
    private Object HibernateConfiguration;
    EntityManager entityManager = HibernateConfiguration.getEntityManager().createEntityManager();
    @Override
    public String saveCompany(Company companies) {
        entityManager.getTransaction().begin();
        entityManager.persist(companies);
        entityManager.getTransaction().commit();
        entityManager.close();
        return null;
    }

    @Override
    public List<Company> getAllCompanies() {
        entityManager.getTransaction().begin();
        List<Company> companies =  entityManager.createQuery("select c from Company c", Company.class).getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return companies;

    }

    @Override
    public String updateCompany(Long id, Company newCompany) {
        entityManager.getTransaction().begin();
        Company companies = entityManager.find(Company.class,id);
        companies.setCountry(newCompany.getCountry());
        companies.setCompany_name(newCompany.getCompany_name());
        companies.setCreated_at(newCompany.getCreated_at());
        entityManager.getTransaction().commit();
        entityManager.close();
        return "Successfully updated";
    }

    @Override
    public String deleteCompanyById(Long id) {
        entityManager.getTransaction().begin();
        entityManager.remove(id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return null;
    }
}
