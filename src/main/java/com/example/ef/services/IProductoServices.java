package com.example.ef.services;

import com.example.ef.entity.Producto;

import java.util.List;

public interface IProductoServices {
    void insert(Producto producto);

    List<Producto> list();
}
