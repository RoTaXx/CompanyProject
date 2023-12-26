package org.example;

import org.example.configuration.SessionFactoryUtil;
import org.example.dao.CompanyDao;
import org.example.entity.Company;
import org.example.entity.CompanyEvent;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        SessionFactoryUtil.getSessionFactory().openSession();

        Company company = new Company("SAP", LocalDate.of(2020,01,01), 5000);
        //CompanyDao.createCompany(company);
        System.out.println(CompanyDao.getCompanyById(2));

        Company company1 = CompanyDao.getCompanyById(1);
        //CompanyDao.deleteCompany(company1);
        CompanyDao.companiesFindByInitialCapitalBetween(100, 100000)
                .stream().forEach(System.out::println);
    }
}