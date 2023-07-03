package com.example.ef.repositories;

import com.example.ef.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsersRepository extends JpaRepository<User,Integer> {
}
