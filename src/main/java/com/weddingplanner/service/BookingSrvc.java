package com.weddingplanner.service;

import com.weddingplanner.model.Booking;
import com.weddingplanner.model.Event;
import com.weddingplanner.model.Vendor;
import com.weddingplanner.repository.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingSrvc {

    @Autowired
    private BookingRepo bookingRepository;

    public Booking bookVendor(Long eventId, Long vendorId) {
        // Logic to check if vendor is available and create booking
        Booking booking = new Booking();
        booking.setEvent(new Event()); // Set the event
        booking.setVendor(new Vendor()); // Set the vendor
        return bookingRepository.save(booking);
    }

    public void cancelBooking(Long bookingId) {
        Booking booking = bookingRepository.findById(bookingId).orElseThrow();
        booking.setCancelled(true);
        bookingRepository.save(booking);
    }
}
