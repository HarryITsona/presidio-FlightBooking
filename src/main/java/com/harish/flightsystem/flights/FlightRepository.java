package com.harish.flightsystem.flights;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends CrudRepository<Flights,Long> {
    List<Flights> findAll();
    List<Flights> findAllById(Long id);
}
