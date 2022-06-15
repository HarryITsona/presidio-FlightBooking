package com.harish.flightsystem.flights;

import java.util.List;

public interface BookingService {

    public List<Booking> getAllBooking();
    public  void addBooking(Booking booking);
    public List<Booking>  getBookingById(long id);
}
