package com.forrajeria.forrajeriaservice.repository;

import com.forrajeria.forrajeriaservice.model.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductosRepository extends JpaRepository<Productos, Long> {
}
