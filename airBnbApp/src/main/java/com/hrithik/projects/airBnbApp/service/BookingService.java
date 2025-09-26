package com.hrithik.projects.airBnbApp.service;

import com.hrithik.projects.airBnbApp.dto.BookingDto;
import com.hrithik.projects.airBnbApp.dto.BookingRequest;

public interface BookingService {

    BookingDto initializeBooking(BookingRequest bookingRequest);
}
