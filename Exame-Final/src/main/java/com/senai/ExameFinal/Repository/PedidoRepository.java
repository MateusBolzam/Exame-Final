package com.senai.ExameFinal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.senai.ExameFinal.Models.Pedidos;


@Repository
public interface PedidoRepository extends JpaRepository<Pedidos, Long> {
    
}
