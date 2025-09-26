package com.hrithik.projects.airBnbApp.dto;

import com.hrithik.projects.airBnbApp.entity.HotelContactInfo;
import lombok.Data;



@Data
public class HotelDto {

    private Long id;
    private String name;
    private String city;
    private String[] photos;
    private String[] amenities;
    private HotelContactInfo contactInfo;
    private boolean active;

}
