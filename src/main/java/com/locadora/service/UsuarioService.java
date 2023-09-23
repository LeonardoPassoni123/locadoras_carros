package com.locadora.service;

import com.locadora.model.Usuario;
import com.locadora.model.helpers.LoginInformacoesDTO;
import com.locadora.repository.UsuarioRepository;
import jakarta.transaction.Transactional;
import jakarta.validation.ValidationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    private final UsuarioRepository repository;

    @Autowired
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }


    public Usuario getById(Long id){
        return this.repository.findById(id).orElse(null);
    }

    public List<Usuario> getAll(){
        return this.repository.findAll();
    }

    @Transactional
    public Usuario save(Usuario usuario){
        if(Boolean.TRUE.equals(this.repository.emailExists(usuario.getEmail()))){
            throw new ValidationException("Email já cadastrado.");
        }
        return this.repository.save(usuario);
    }

    @Transactional
    public Usuario saveWithoutValidation(Usuario usuario){
        return this.save(usuario);
    }

    @Transactional
    public void deleteById(Long id){
        this.repository.deleteById(id);
    }

    @Transactional
    public void deleteAll(){
        this.repository.deleteAll();
    }

    public Boolean validateCredentials(Usuario dto){
        return this.repository.findLoginInformation(dto.getEmail(), dto.getSenha());
    }
}
