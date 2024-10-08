package com.jpa.proyecto.domain.services.producto;

import java.util.List;
import java.util.Optional;

import com.jpa.proyecto.persistence.entities.Producto;

public interface ProductoService {

    List<Producto> findAll();

    Optional<Producto> findById(Long id);

    Producto save(Producto producto);

    Optional<Producto> update(Long id, Producto producto);

    Optional<Producto> delete(Long id);

    List<Producto> findProductsByGama(Long gamaProducto);

    List<Producto> findProductsWithLowStock(int stockMinimo);
}
