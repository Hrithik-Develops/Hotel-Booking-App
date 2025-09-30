package com.hrithik.projects.airBnbApp.service;

import com.hrithik.projects.airBnbApp.dto.HotelDto;
import com.hrithik.projects.airBnbApp.dto.HotelPriceDto;
import com.hrithik.projects.airBnbApp.dto.HotelSearchRequest;
import com.hrithik.projects.airBnbApp.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);
    void deleteAllInventories(Room room);

    Page<HotelPriceDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
