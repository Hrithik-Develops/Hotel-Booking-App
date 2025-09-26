package com.hrithik.projects.airBnbApp.entity;

import com.hrithik.projects.airBnbApp.entity.enums.Roles;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name= "app_user")
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(unique=true,nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    private String name;

    @ElementCollection(fetch=FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Roles> roles;
}
