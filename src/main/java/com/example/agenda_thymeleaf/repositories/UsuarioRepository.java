package com.example.agenda_thymeleaf.repositories;

import com.example.agenda_thymeleaf.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,String> {
}