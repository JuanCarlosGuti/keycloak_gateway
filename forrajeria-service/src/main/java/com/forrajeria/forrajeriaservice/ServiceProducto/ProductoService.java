package com.forrajeria.forrajeriaservice.ServiceProducto;

import com.forrajeria.forrajeriaservice.model.Productos;
import com.forrajeria.forrajeriaservice.repository.ProductosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;




@Service
public class ProductoService implements IProductoService{

    @Autowired
    private ProductosRepository repository;

    @Override
    public List<Productos> findProductos() {

       return repository.findAll();
    }
}
