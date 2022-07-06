package com.senai.ExameFinal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.ExameFinal.Models.Pedidos;
import com.senai.ExameFinal.Services.PedidoService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/pedidos")
public class PedidoController {
    

    @Autowired
    private PedidoService pedidoService;


    @PostMapping("/create")
    public ResponseEntity<Pedidos> create(@RequestBody Pedidos obj){
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.create(obj));
    }

    @GetMapping
    public ResponseEntity<List<Pedidos>> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.findAll());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Pedidos> findById(@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.findById(id));
    }

    @PutMapping(value = "/update")
    public ResponseEntity<Pedidos> update(@RequestBody Pedidos obj){
        return ResponseEntity.status(HttpStatus.OK).body(pedidoService.update(obj));
    }
}
