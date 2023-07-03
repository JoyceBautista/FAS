package com.example.ef.serviceImpl;
import com.example.ef.services.IProductoServices;
import com.example.ef.entity.Producto;
import com.example.ef.repositories.IProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl implements IProductoServices {
    @Autowired
    private IProductosRepository pR;

    @Override
    public void insert(Producto producto){pR.save(producto);
    }

    @Override
    public List<Producto> list(){return pR.findAll();}
}
