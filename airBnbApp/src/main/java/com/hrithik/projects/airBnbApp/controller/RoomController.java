package com.hrithik.projects.airBnbApp.controller;

import com.hrithik.projects.airBnbApp.dto.HotelDto;
import com.hrithik.projects.airBnbApp.dto.RoomDto;
import com.hrithik.projects.airBnbApp.service.RoomService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin/hotels/{hotelId}/rooms")
@RequiredArgsConstructor
public class RoomController {

    private final RoomService roomService;

    @PostMapping
    public ResponseEntity<RoomDto> createNewRoom(@PathVariable Long hotelId , @RequestBody RoomDto roomDto){

     RoomDto room =   roomService.createNewRoom(hotelId,roomDto);
     return new ResponseEntity<>(room, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<RoomDto>> getAllRoomsInHotel(@PathVariable Long hotelId){

      List<RoomDto> rooms = roomService.getAllRoomsInHotel(hotelId);

      return ResponseEntity.ok(rooms);
    }

    @GetMapping("/{roomId}")
    public ResponseEntity<RoomDto> getRoomById(@PathVariable Long hotelId, @PathVariable Long roomId){
        return  ResponseEntity.ok(roomService.getRoomById(roomId));
    }


    @DeleteMapping("/{roomId}")
    public ResponseEntity<RoomDto> deleteRoomById(@PathVariable Long roomId){
        roomService.deleteRoomById(roomId);
        return ResponseEntity.noContent().build();
    }





}
