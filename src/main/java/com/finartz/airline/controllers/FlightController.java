package com.finartz.airline.controllers;

import com.finartz.airline.entities.Flight;
import com.finartz.airline.models.FlightRequest;
import com.finartz.airline.services.FlightService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/airline")
public class FlightController {

    private final FlightService flightService;

    @GetMapping(value = "/flight/get/{id}")
    ResponseEntity<Flight> getFlight(@PathVariable int id) throws Exception {
        return ResponseEntity.ok(flightService.getFlight(id));
    }

    @PostMapping(value = "/flight/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Boolean> addFlight(@RequestBody FlightRequest request) {
        return ResponseEntity.ok(flightService.addFlight(request));
    }
}
