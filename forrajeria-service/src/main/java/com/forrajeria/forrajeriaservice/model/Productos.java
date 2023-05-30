package com.forrajeria.forrajeriaservice.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Productos {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id_producto;

    @Column(name = "nombre_prod")
    private String nombre;

    @Column(name = "peso_prod")
    private Double peso;

    @Column(name = "precio_prod")
    private Double precio;





}
