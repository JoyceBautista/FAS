package com.example.ef.controller;

import org.modelmapper.ModelMapper;
import com.example.ef.dto.UserDto;
import com.example.ef.entity.User;
import com.example.ef.services.IUsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/User")
public class UserController {

    @Autowired
    private IUsuarioService uS;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void insert(@RequestBody UserDto dto){
            ModelMapper m =new ModelMapper();
            User p =m.map(dto, User.class);
            uS.insert(p);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<UserDto> list(){
        return uS.list().stream(). map(x->{
            ModelMapper m =new ModelMapper();
            return m.map(x, UserDto.class);
        }).collect(Collectors.toList());
    }
}
