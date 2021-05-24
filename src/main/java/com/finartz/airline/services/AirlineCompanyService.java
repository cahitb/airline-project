package com.finartz.airline.services;

import com.finartz.airline.entities.Company;
import com.finartz.airline.models.CompanyRequest;
import com.finartz.airline.repository.CompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AirlineCompanyService {

    private final CompanyRepository companyRepository;

    public Company getAirlineCompany(Integer id) throws Exception {
        final Optional<Company> optCompany = companyRepository.findById(id);
        Company company;

        if (optCompany.isPresent()) {
            company = optCompany.get();
        } else {
            throw new Exception("there is no airline with request id");
        }

        return company;
    }

    public Boolean addAirlineCompany(CompanyRequest request) {
        Company company = new Company();
        company.setCompanyName(request.getCompanyName());
        companyRepository.save(company);
        //there is no exception handling, always success...
        return true;
    }
}
