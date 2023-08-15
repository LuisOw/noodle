package com.example.Noodle.service;

import com.example.Noodle.dto.UserDto;
import com.example.Noodle.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService <T extends User, G extends UserDto> {

    public Page<G> getUser(Pageable pageable);
    public G createUser(G userDto);
}
