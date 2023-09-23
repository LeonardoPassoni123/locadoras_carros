package com.locadora.api;


import com.locadora.model.Locacao;
import com.locadora.service.LocacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/locacao")
@CrossOrigin
public class LocacaoAPI {

    private final LocacaoService service;

    @Autowired
    public LocacaoAPI(LocacaoService service) {
        this.service = service;
    }


    @GetMapping("/get-by-id")
    public ResponseEntity<Locacao> getById(@RequestParam("id") Long id){
        return ResponseEntity.ok(this.service.getById(id));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Locacao>> getAll(){
        return ResponseEntity.ok(this.service.getAll());
    }


    @PostMapping("/save")
    public ResponseEntity<Locacao> save(@RequestBody Locacao locacao){
        return ResponseEntity.ok(this.service.save(locacao));
    }

    @PutMapping("/update")
    public ResponseEntity<Locacao> update(@RequestBody Locacao locacao){
        return ResponseEntity.ok(this.service.save(locacao));
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
