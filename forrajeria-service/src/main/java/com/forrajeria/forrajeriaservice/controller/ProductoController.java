package com.forrajeria.forrajeriaservice.controller;

import com.forrajeria.forrajeriaservice.DTO.ProductoProveedorDTO;
import com.forrajeria.forrajeriaservice.DTO.ProductoVendedorDTO;
import com.forrajeria.forrajeriaservice.ServiceProducto.IProductoService;
import com.forrajeria.forrajeriaservice.model.Productos;
import com.forrajeria.forrajeriaservice.util.ConvertDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    @Autowired
    private IProductoService productoService;

    @GetMapping("/proveedores")
    @PreAuthorize("hasRole('ROLE_proveedor')")
    public List<ProductoProveedorDTO> getProductosProveedor(){
            List<Productos> productos = productoService.findProductos();

        List<ProductoProveedorDTO> productosProvDTO = productos.stream()
                .map(ConvertDTO::toProvDTO)
                .collect(Collectors.toList());

         return productosProvDTO;

    }

    @GetMapping("/vendedores")
    @PreAuthorize("hasRole('ROLE_vendedor')")
    public List<ProductoVendedorDTO> getProductosVendedor(){
        List<Productos> productos = productoService.findProductos();
        List<ProductoVendedorDTO> productosVenDTO = productos.stream()
                .map(ConvertDTO::toVendDTO)
                .collect(Collectors.toList());

        return productosVenDTO;
    }




}
