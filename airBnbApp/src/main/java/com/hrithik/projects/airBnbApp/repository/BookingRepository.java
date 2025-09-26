package com.hrithik.projects.airBnbApp.repository;

import com.hrithik.projects.airBnbApp.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Long> {

}
