package com.locadora.api;

import com.locadora.model.Usuario;
import com.locadora.model.helpers.LoginInformacoesDTO;
import com.locadora.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
@CrossOrigin
public class UsuarioAPI {

    private final UsuarioService service;

    @Autowired
    public UsuarioAPI(UsuarioService service) {
        this.service = service;
    }


    @GetMapping("/get-by-id")
    public ResponseEntity<Usuario> getById(@RequestParam("id") Long id){
        return ResponseEntity.ok(this.service.getById(id));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Usuario>> getAll(){
        return ResponseEntity.ok(this.service.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Usuario> save(@RequestBody Usuario usuario){
        return ResponseEntity.ok(this.service.save(usuario));
    }

    @PutMapping("/update")
    public ResponseEntity<Usuario> update(@RequestBody Usuario usuario){
        return ResponseEntity.ok(this.service.saveWithoutValidation(usuario));
    }

    @DeleteMapping("/delete-by-id")
    public ResponseEntity deleteById(@RequestParam("id") Long id){
        this.service.deleteById(id);
        return ResponseEntity.accepted().build();
    }

    @DeleteMapping("/delete-all")
    public ResponseEntity deleteAll(){
        this.service.deleteAll();
        return ResponseEntity.accepted().build();
    }

    @PostMapping("/validate-credentials")
    public ResponseEntity<Boolean> validateCredentials(@RequestBody Usuario dto){
        return ResponseEntity.ok(this.service.validateCredentials(dto));
    }
}
