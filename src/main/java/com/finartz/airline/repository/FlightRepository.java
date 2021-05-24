package com.finartz.airline.repository;

import com.finartz.airline.entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
    Optional<Flight> findById(Integer id);
}
