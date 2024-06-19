package com.example.Lissabon.Dto;

import com.example.Lissabon.Model.Role;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {


    private Long id;

    private String name;

    private String password;


    private Set<Role> roles;
}
