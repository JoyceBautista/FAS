package com.example.ef.repositories;

import com.example.ef.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductosRepository extends JpaRepository<Producto, Integer> {
}
