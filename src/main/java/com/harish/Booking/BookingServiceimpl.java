package com.harish.flightsystem.flights;

import com.harish.flightsystem.flights.FlightRepository;
import com.harish.flightsystem.flights.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingtServiceImpl implements BookingService {

    @Autowired
    BookingRepository BookingRepository;
    @Override
    public List<Flights> getAllFlight() {
        return flightRepository.findAll();
    }

    @Override
    public void addFlight(Flights flights) {
            flightRepository.save(flights);
    }

    @Override
    public List<Flights> getFlightById(long id) {
        return flightRepository.findAllById(id);
    }
}
