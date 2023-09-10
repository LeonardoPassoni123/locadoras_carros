package com.locadora.service;

import com.locadora.model.Cliente;
import com.locadora.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;

    @Autowired
    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }


    public Cliente getById(Long id){
        return this.repository.findById(id).orElse(null);
    }

    public List<Cliente> getAll(){
        return this.repository.findAll();
    }

    @Transactional
    public Cliente save(Cliente cliente){
        return this.repository.save(cliente);
    }

    @Transactional
    public void deleteById(Long id){
        this.repository.deleteById(id);
    }

    @Transactional
    public void deleteAll(){
        this.repository.deleteAll();
    }
}
