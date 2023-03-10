package com.example.tiemdaMia.controladores;

import com.example.tiemdaMia.entidades.Producto;
import com.example.tiemdaMia.servicio.Servicioproducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("tienda/api/")
public class ControladorProducto {

    @Autowired
    Servicioproducto servicioProducto;

    @PostMapping
    public ResponseEntity<?>registrarProducto(@RequestBody Producto producto){
        try{

            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(servicioProducto.agregar(producto));

        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error al registrar el producto");
        }
    }

    @GetMapping
    public ResponseEntity<?> buscarTodosProductos(){
        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioProducto.buscarTodos());
        }catch (Exception error) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Error buscando los productos");

        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> buscarProductoId(@PathVariable Integer id){

        try{
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body(servicioProducto.buscarPorId(id));

        }catch(Exception error){
            return ResponseEntity
                    .status(HttpStatus.OK)
                    .body("Error consultando la informacion");
        }

    }

}

