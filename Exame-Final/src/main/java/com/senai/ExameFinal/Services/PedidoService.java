package com.senai.ExameFinal.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.ExameFinal.Models.Pedidos;
import com.senai.ExameFinal.Repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepo;

    public Pedidos create(Pedidos obj){
        return pedidoRepo.save(obj);
    }

    public Pedidos findById(Long id){
        return pedidoRepo.findById(id).orElse(null);
    }
    public List<Pedidos> findAll(){
        return pedidoRepo.findAll();
    }

    public Pedidos update(Pedidos obj){
        pedidoRepo.delete(obj);
        Pedidos ped = new Pedidos();
        ped.setAberto(obj.isAberto());
        ped.setId(obj.getId());
        ped.setNome(obj.getNome());
        ped.setValor(obj.getValor());
        return pedidoRepo.save(ped);
    }
    

}
