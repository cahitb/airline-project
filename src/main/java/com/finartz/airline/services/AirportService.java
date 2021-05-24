package com.finartz.airline.services;

import com.finartz.airline.entities.Airport;
import com.finartz.airline.models.AirportRequest;
import com.finartz.airline.repository.AirportRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class AirportService {

    private final AirportRepository airportRepository;

    public Airport getAirport(Integer id) throws Exception {
        final Optional<Airport> optAirport = airportRepository.findById(id);
        Airport airport;

        if (optAirport.isPresent()) {
            airport = optAirport.get();
        } else {
            throw new Exception("there is no airline with request id");
        }

        return airport;
    }

    public Boolean addAirport(AirportRequest request) {
        Airport airport = new Airport();
        airport.setAirportName(request.getAirportName());
        airportRepository.save(airport);
        //there is no exception handling, always success...
        return true;
    }
}
