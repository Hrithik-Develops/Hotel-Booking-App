package com.hrithik.projects.airBnbApp.service;

import com.hrithik.projects.airBnbApp.dto.BookingDto;
import com.hrithik.projects.airBnbApp.dto.BookingRequest;
import com.hrithik.projects.airBnbApp.entity.Hotel;
import com.hrithik.projects.airBnbApp.entity.Room;
import com.hrithik.projects.airBnbApp.exception.ResourceNotFoundException;
import com.hrithik.projects.airBnbApp.repository.BookingRepository;
import com.hrithik.projects.airBnbApp.repository.HotelRepository;
import com.hrithik.projects.airBnbApp.repository.InventoryRepository;
import com.hrithik.projects.airBnbApp.repository.RoomRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BookingServiceImpl implements BookingService{
    private final GuestRepository guestRepository;
    private final ModelMapper modelMapper;

    private final BookingRepository bookingRepository;
    private final HotelRepository hotelRepository;
    private final RoomRepository roomRepository;
    private final InventoryRepository inventoryRepository;
    @Override
    public BookingDto initializeBooking(BookingRequest bookingRequest) {
        Hotel hotel = hotelRepository.findById(bookingRequest.getHotelId()).orElseThrow(() ->
                new ResourceNotFoundException("Hotel not found with id: "+bookingRequest.getHotelId()));

        Room room = roomRepository.findById(bookingRequest.getRoomId()).orElseThrow(() ->
                new ResourceNotFoundException("Room not found with id: "+bookingRequest.getRoomId()));



    }
}
