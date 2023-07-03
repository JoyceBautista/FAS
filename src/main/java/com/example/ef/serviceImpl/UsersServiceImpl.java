package com.example.ef.serviceImpl;

import com.example.ef.entity.User;
import com.example.ef.repositories.IUsersRepository;
import com.example.ef.services.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsersServiceImpl implements IUsuarioService {
    @Autowired
    private IUsersRepository uR;

    @Override
    public void insert(User user) {uR.save(user);
    }

    @Override
    public List<User> list(){return uR.findAll();}
}
