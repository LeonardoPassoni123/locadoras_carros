package com.locadora.repository;

import com.locadora.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {

    @Query(nativeQuery = true,
            value = "SELECT * FROM carro")
    List<Carro> getAllAvaliable();
}
