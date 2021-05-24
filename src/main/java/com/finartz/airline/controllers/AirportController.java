package com.finartz.airline.controllers;

import com.finartz.airline.entities.Airport;
import com.finartz.airline.models.AirportRequest;
import com.finartz.airline.services.AirportService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/airline")
public class AirportController {

    private final AirportService airportService;

    @GetMapping(value = "/airport/get/{id}")
    ResponseEntity<Airport> getAirport(@PathVariable int id) throws Exception {
        return ResponseEntity.ok(airportService.getAirport(id));
    }

    @PostMapping(value = "/airport/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Boolean> addAirport(@RequestBody AirportRequest request) {
        return ResponseEntity.ok(airportService.addAirport(request));
    }
}
