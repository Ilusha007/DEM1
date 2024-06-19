package com.example.Lissabon.Service;


import com.example.Lissabon.Dto.UserDto;
import com.example.Lissabon.Model.Role;
import com.example.Lissabon.Model.User;
import com.example.Lissabon.Repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
@RequiredArgsConstructor


public class UserService {

    private final UserRepo userRepo;

    private final PasswordEncoder passwordEncoder;

    public void registration(UserDto userDto){
        User user = new User();
        user.setName(userDto.getName());
        user.setPassword(passwordEncoder.encode(userDto.getPassword()));
        user.setRoles(Collections.singleton(Role.USER));
        userRepo.save(user);

    }
}
