package com.example.ef.services;


import com.example.ef.entity.User;

import java.util.List;

public interface IUsuarioService {

    public void insert(User usuario);

    List<User> list();
}
