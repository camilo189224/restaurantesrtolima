package com.example.tiemdaMia.repositorio;

import com.example.tiemdaMia.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepositorio extends JpaRepository<Producto,Integer> {
}