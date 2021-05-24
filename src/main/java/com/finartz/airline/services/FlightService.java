package com.finartz.airline.services;

import com.finartz.airline.entities.Flight;
import com.finartz.airline.models.FlightRequest;
import com.finartz.airline.repository.FlightRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class FlightService {

    private final FlightRepository flightRepository;

    public Flight getFlight(Integer id) throws Exception {
        final Optional<Flight> optFlight = flightRepository.findById(id);
        Flight flight;

        if (optFlight.isPresent()) {
            flight = optFlight.get();
        } else {
            throw new Exception("there is no airline with request id");
        }

        return flight;
    }

    public Boolean addFlight(FlightRequest request) {
        Flight flight = Flight.builder()
                .companyId(request.getCompanyId())
                .routeId(request.getRouteId())
                .price(request.getPrice())
                .totalCapacity(request.getCapacity())
                .sold(0)
                .build();

        flightRepository.save(flight);
        //there is no exception handling, always success...
        return true;
    }
}
