package com.example.Lissabon.Controllers;


import com.example.Lissabon.Dto.UserDto;
import com.example.Lissabon.Service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
@RequestMapping("/registration")
public class AuthController {

    private final UserService userService;

    @GetMapping
    public String registerForm(){
        return "registration";
    }

    @PostMapping
    public String registration(UserDto userDto){
        userService.registration(userDto);
        return "redirect:/login";
    }
}
