package com.example.ef.entity;

import lombok.Generated;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idUser;
     @Column(name="name", length = 50, nullable = false)
    private String name_User;

     @ManyToOne
     @JoinColumn(name="id_producto")
     private Producto producto;
     public User(){

     }
}
