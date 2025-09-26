package com.hrithik.projects.airBnbApp.controller;

import com.hrithik.projects.airBnbApp.dto.BookingDto;
import com.hrithik.projects.airBnbApp.dto.BookingRequest;
import com.hrithik.projects.airBnbApp.service.BookingService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookings")
public class HotelBookingController {

    private BookingService bookingService;

    public ResponseEntity<BookingDto>  initializeBookings(@RequestBody BookingRequest bookingRequest){

        return ResponseEntity.ok(bookingService.initializeBooking(bookingRequest));


    }

}
