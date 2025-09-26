package com.hrithik.projects.airBnbApp.repository;

import com.hrithik.projects.airBnbApp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}