package com.hrithik.projects.airBnbApp.service;

import com.hrithik.projects.airBnbApp.dto.BookingDto;
import com.hrithik.projects.airBnbApp.dto.BookingRequest;
import com.hrithik.projects.airBnbApp.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initializeBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
