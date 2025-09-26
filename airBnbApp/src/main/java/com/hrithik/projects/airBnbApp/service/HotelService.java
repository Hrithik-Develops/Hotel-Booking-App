package com.hrithik.projects.airBnbApp.service;

import com.hrithik.projects.airBnbApp.dto.HotelDto;
import com.hrithik.projects.airBnbApp.dto.HotelInfoDto;
import com.hrithik.projects.airBnbApp.entity.Hotel;

public interface HotelService {

    HotelDto createNewHotel(HotelDto hotelDto);
    HotelDto getHotelById(Long id);
    HotelDto updateHotelById(Long id, HotelDto hotelDto);
    void deleteHotelById(Long id);
    void activateHotel(Long hotelId);

    HotelInfoDto getHotelInfoById(Long hotelId);
}
