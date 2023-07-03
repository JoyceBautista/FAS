package com.example.ef.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="producto")
@Getter
@Setter
public class Producto {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id_Productos;
    @Column(name="Productos", length = 35, nullable = false)
    private String Productos;
    @Column(name="categoria")
    private String Categoria;
    @Column (name="claves")
    private String Claves;
    @Column(name="descripción")
    private String Descripcion;
    @Column(name="id")
    private int id_producto;
    @Column(name="nombre")
    private String n_producto;
    @Column(name="precio")
    private int precio;
    @Column(name="subcategoria")
    private String sub_categoria;
    @Column(name="url")
    private String url_producto;
}
