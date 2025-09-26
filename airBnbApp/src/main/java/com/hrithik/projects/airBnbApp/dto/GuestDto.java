package com.hrithik.projects.airBnbApp.dto;

import com.hrithik.projects.airBnbApp.entity.User;
import com.hrithik.projects.airBnbApp.entity.enums.Gender;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class GuestDto {

    private Long id;
    private String name;
    private Integer age;
    private Gender gender;
    private User user;
}
