package com.hrithik.projects.airBnbApp.repository;

import com.hrithik.projects.airBnbApp.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}