package com.example.Lissabon.Service;


import com.example.Lissabon.Model.User;
import com.example.Lissabon.Repository.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor

public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException{
        User user = userRepo.findByName(name);
        if (user == null){
            throw new UsernameNotFoundException("Пользователь не найден");
        }
        List<SimpleGrantedAuthority> authorityList = user.getRoles().stream().map(
                role -> new SimpleGrantedAuthority("ROLE_"+ role.name()))
                .collect(Collectors.toList());
        return new org.springframework.security.core.userdetails.User(user.getName(),user.getPassword(), authorityList);
    }

}
