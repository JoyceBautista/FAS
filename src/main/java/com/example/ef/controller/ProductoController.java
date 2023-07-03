package com.example.ef.controller;


import com.example.ef.dto.ProductoDto;
import com.example.ef.entity.Producto;
import com.example.ef.services.IProductoServices;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/Producto")
public class ProductoController {
    @Autowired
    private IProductoServices pS;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public void insert(@RequestBody ProductoDto dto){
        ModelMapper m =new ModelMapper();
        Producto p =m.map(dto, Producto.class);
        pS.insert(p);
    }

    @ResponseStatus(HttpStatus.OK)
    @GetMapping
    public List<ProductoDto> list(){
        return pS.list(). stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x, ProductoDto.class);
        }).collect(Collectors.toList());
    }
}
