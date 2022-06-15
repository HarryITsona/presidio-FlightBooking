package com.harish.flightsystem.flights;

import java.util.List;

public interface BookingService {

    public List<Flights> getAllFlight();
    public  void addFlight(Flights flights);
    public List<Flights>  getFlightById(long id);
}
