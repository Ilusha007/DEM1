package com.example.Lissabon.Repository;

import com.example.Lissabon.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {

    User findByName(String name);

}
