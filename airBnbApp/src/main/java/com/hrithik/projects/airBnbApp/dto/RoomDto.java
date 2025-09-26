package com.hrithik.projects.airBnbApp.dto;

import com.hrithik.projects.airBnbApp.entity.Hotel;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class RoomDto {

    private Long id;
    private String type;
    private BigDecimal basePrice;
    private Integer totalCount;
    private Integer capacity;
    private String[] photos;
    private String[] amenities;


}
