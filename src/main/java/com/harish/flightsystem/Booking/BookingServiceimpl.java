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
    public List<Flights> getAllBooking() {
        return bookingRepository.findAll();
    }

    @Override
    public void addBooking(Booking booking) {
            bookingRepository.save(booking);
    }

    @Override
    public List<Flights> getBookingById(long id) {
        return bookingRepository.findAllById(id);
    }
}
