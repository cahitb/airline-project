package com.finartz.airline.repository;

import com.finartz.airline.entities.Route;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RouteRepository extends JpaRepository<Route, Integer> {
    Optional<Route> findById(Integer id);
}
