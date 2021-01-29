package com.ada.ADA.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ada.ADA.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	public List<Usuario> findAllBycargoContainingIgnoreCase 	   (String cargo);
	public List<Usuario> findAllByemailContainingIgnoreCase 	   (String email);
	public List<Usuario> findAllBynomeCompletoContainingIgnoreCase (String nomeCompleto);
}