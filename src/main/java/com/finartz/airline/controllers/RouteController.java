package com.finartz.airline.controllers;

import com.finartz.airline.entities.Route;
import com.finartz.airline.models.RouteRequest;
import com.finartz.airline.services.RouteService;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/airline")
public class RouteController {

    private final RouteService routeService;

    @GetMapping(value = "/route/get/{id}")
    ResponseEntity<Route> getRoute(@PathVariable int id) throws Exception {
        return ResponseEntity.ok(routeService.getRoute(id));
    }

    @PostMapping(value = "/route/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<Boolean> addRoute(@RequestBody RouteRequest request) {
        return ResponseEntity.ok(routeService.addRoute(request));
    }
}
