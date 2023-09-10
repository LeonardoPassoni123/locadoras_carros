package com.locadora.repository;

import com.locadora.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Query(value = "SELECT " +
                   "    count(*) > 0 " +
                   "FROM Usuario u " +
                   "WHERE " +
                   "    u.email = :email " +
                   "    AND u.senha = :senha  ")
    Boolean findLoginInformation(@Param("email") String email,
                                 @Param("senha") String senha);

    @Query(value = "SELECT " +
                   "    count(*) > 0 " +
                   "FROM Usuario u " +
                   "WHERE " +
                   "    u.email = :email ")
    Boolean emailExists(@Param("email") String email);
}
