package com.example.tiendaMia.repositorio;

import com.example.tiendaMia.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {
}