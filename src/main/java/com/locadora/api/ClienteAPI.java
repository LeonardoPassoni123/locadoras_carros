package com.locadora.api;

import com.locadora.model.Cliente;
import com.locadora.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin(originPatterns = "http://localhost:[*]")
public class ClienteAPI {


    private final ClienteService service;

    @Autowired
    public ClienteAPI(ClienteService service) {
        this.service = service;
    }


    @GetMapping("/get-by-id")
    public ResponseEntity<Cliente> getById(@RequestParam("id") Long id){
        return ResponseEntity.ok(this.service.getById(id));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Cliente>> getAll(){
        return ResponseEntity.ok(this.service.getAll());
    }

    @PostMapping("/save")
    public ResponseEntity<Cliente> save(@RequestBody Cliente cliente){
        return ResponseEntity.ok(this.service.save(cliente));
    }

    @PutMapping("/update")
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente){
        return ResponseEntity.ok(this.service.save(cliente));
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
}
