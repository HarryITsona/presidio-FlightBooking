package com.harish.flightsystem.flights;

import com.harish.flightsystem.flights.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class BookingController {
    @Autowired
    FlightService flightService;

    @GetMapping("/all")
    public List<Flights> getAllFlights(){
        return flightService.getAllFlight();
    }
    @GetMapping("/{id}")
    public List<Flights> getFlightById(@PathVariable Long id){
        return flightService.getFlightById(id);
    }

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public void addFlight(@RequestBody Flights flights){
        flightService.addFlight(flights);
    }


}
