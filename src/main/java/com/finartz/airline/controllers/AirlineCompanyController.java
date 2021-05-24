package com.finartz.airline.controllers;

import com.finartz.airline.entities.Company;
import com.finartz.airline.models.CompanyRequest;
import com.finartz.airline.services.AirlineCompanyService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/airline")
public class AirlineCompanyController {

    private final AirlineCompanyService airlineCompanyService;

    @GetMapping(value = "/company/get/{id}")
    ResponseEntity<Company> getAirlineCompany(@PathVariable int id) throws Exception {
        return ResponseEntity.ok(airlineCompanyService.getAirlineCompany(id));
    }

    @PostMapping(value = "/company/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Boolean> addAirlineCompany(@RequestBody CompanyRequest request) {
        return ResponseEntity.ok(airlineCompanyService.addAirlineCompany(request));
    }
}
