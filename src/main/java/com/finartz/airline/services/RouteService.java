package com.finartz.airline.services;

import com.finartz.airline.entities.Route;
import com.finartz.airline.models.RouteRequest;
import com.finartz.airline.repository.RouteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class RouteService {

    private final RouteRepository routeRepository;

    public Route getRoute(Integer id) throws Exception {
        final Optional<Route> optRoute = routeRepository.findById(id);
        Route route;

        if (optRoute.isPresent()) {
            route = optRoute.get();
        } else {
            throw new Exception("there is no airline with request id");
        }

        return route;
    }

    public Boolean addRoute(RouteRequest request) {
        Route route = Route.builder()
                .fromAirlineId(request.getFromAirlineId())
                .toAirlineId(request.getToAirlineId())
                .build();

        routeRepository.save(route);
        //there is no exception handling, always success...
        return true;
    }
}
