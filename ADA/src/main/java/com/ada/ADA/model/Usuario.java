package com.ada.ADA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_usuario; // Identificador único do usuário
	
	@NotNull
	@Size(min = 5 , max = 900)
	private String nome_completo; // Para o cadastro da usuária da rede social. Terá no máximo 900 caracteres.
	
	@NotNull
	@Size(min = 2, max = 50)
	private String cargo; // Para verificar o cargo/profissão da usuária na rede social.
	
	@NotNull
	@Size(min = 8 , max = 1000)
	private String email; // Para o cadastro de acesso da usuária na rede social. Terá no máximo 1000 caracteres.
	
	@NotNull
	@Size(min = 6, max = 20)
	private String senha; // Será usado para segurança e entrada da usuária na rede social. Terá no máximo 20 caracteres
	
	@Size(min = 5, max = 2000)
	private String link; 
	
	//Início getters and setters
	
	public long getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(long id_usuario) {
		this.id_usuario = id_usuario;
	}
	public String getNome_completo() {
		return nome_completo;
	}
	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	//Fim getters and setters
}
