package com.harish.flightsystem.flights;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends CrudRepository<Booking,Long> {
    List<Flights> findAll();
    List<Flights> findAllById(Long id);
}
