package com.locadora.api;


import com.locadora.model.Carro;
import com.locadora.service.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/carro")
@CrossOrigin
public class CarroAPI {

    private final CarroService service;

    @Autowired
    public CarroAPI(CarroService service) {
        this.service = service;
    }


    @GetMapping("/get-by-id")
    public ResponseEntity<Carro> getById(@RequestParam("id") Long id){
        return ResponseEntity.ok(this.service.getById(id));
    }

    @GetMapping("/get-all")
    public ResponseEntity<List<Carro>> getAll(){
        return ResponseEntity.ok(this.service.getAll());
    }

    @GetMapping("/get-all-avaliable")
    public ResponseEntity<List<Carro>> getAllAvaliable(){
        return ResponseEntity.ok(this.service.getAllAvaliable());
    }

    @PostMapping("/save")
    public ResponseEntity<Carro> save(@RequestBody Carro carro){
        return ResponseEntity.ok(this.service.save(carro));
    }

    @PutMapping("/update")
    public ResponseEntity<Carro> update(@RequestBody Carro carro){
        return ResponseEntity.ok(this.service.save(carro));
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
