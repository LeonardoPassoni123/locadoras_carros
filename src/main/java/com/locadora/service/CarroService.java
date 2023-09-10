package com.locadora.service;


import com.locadora.model.Carro;
import com.locadora.repository.CarroRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {

    private final CarroRepository repository;

    @Autowired
    public CarroService(CarroRepository repository) {
        this.repository = repository;
    }


    public Carro getById(Long id){
        return this.repository.findById(id).orElse(null);
    }

    public List<Carro> getAll(){
        return this.repository.findAll();
    }

    @Transactional
    public Carro save(Carro carro){
        return this.repository.save(carro);
    }

    @Transactional
    public void deleteById(Long id){
        this.repository.deleteById(id);
    }

    @Transactional
    public void deleteAll(){
        this.repository.deleteAll();
    }

    public List<Carro> getAllAvaliable() {
        return this.repository.getAllAvaliable();
    }
}
