package com.hrithik.projects.airBnbApp.dto;

import com.hrithik.projects.airBnbApp.entity.Guest;
import com.hrithik.projects.airBnbApp.entity.Hotel;
import com.hrithik.projects.airBnbApp.entity.Room;
import com.hrithik.projects.airBnbApp.entity.User;
import com.hrithik.projects.airBnbApp.entity.enums.BookingStatus;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDto {
    private Long id;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;
}
