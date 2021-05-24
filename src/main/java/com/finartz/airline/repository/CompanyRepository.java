package com.finartz.airline.repository;

import com.finartz.airline.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
    Optional<Company> findById(Integer id);
}
