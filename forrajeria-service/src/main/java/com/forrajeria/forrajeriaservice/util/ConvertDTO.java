package com.forrajeria.forrajeriaservice.util;

import com.forrajeria.forrajeriaservice.DTO.ProductoProveedorDTO;
import com.forrajeria.forrajeriaservice.DTO.ProductoVendedorDTO;
import com.forrajeria.forrajeriaservice.model.Productos;

public class ConvertDTO {

    public static ProductoProveedorDTO toProvDTO(Productos prod){
        ProductoProveedorDTO prodProvDTO = new ProductoProveedorDTO();
        prodProvDTO.setPrecio(prod.getPrecio());
        prodProvDTO.setNombre(prod.getNombre());

        return prodProvDTO;
    }

    public static ProductoVendedorDTO toVendDTO(Productos prod){
       ProductoVendedorDTO prodvendDTO = new ProductoVendedorDTO();
        prodvendDTO.setPrecio(prod.getPrecio());
        prodvendDTO.setPeso(prod.getPeso());
        prodvendDTO.setNombre(prod.getNombre());

        return prodvendDTO;

    }


}
