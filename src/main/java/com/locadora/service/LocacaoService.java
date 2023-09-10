package com.locadora.service;

import com.locadora.model.Locacao;
import com.locadora.repository.LocacaoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocacaoService {

    private final LocacaoRepository repository;

    @Autowired
    public LocacaoService(LocacaoRepository repository) {
        this.repository = repository;
    }

    public Locacao getById(Long id){
        return this.repository.findById(id).orElse(null);
    }

    public List<Locacao> getAll(){
        return this.repository.findAll();
    }

    @Transactional
    public Locacao save(Locacao locacao){
        return this.repository.save(locacao);
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
