package com.ada.ADA.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id; // Identificador único do usuário
	
	@NotBlank(message = "Nome é obrigatório")
	@Size(min = 5 , max = 900)
	private String nomeCompleto; // Para o cadastro da usuária da rede social. Terá no máximo 900 caracteres.
	
	@NotBlank
	@Size(min = 2, max = 50)
	private String cargo; // Para verificar o cargo/profissão da usuária na rede social.
	
	@Email				   					//Valida que é um campo de e-mail
	@Column(unique = true) 					//Garante que o e-mail não seja duplicado.  
	@NotBlank
	@Size(min = 8 , max = 1000)
	private String email; // Para o cadastro de acesso da usuária na rede social. Terá no máximo 1000 caracteres.
	
	@NotBlank
	@Size(min = 6, max = 20)
	private String senha; // Será usado para segurança e entrada da usuária na rede social. Terá no máximo 20 caracteres
	
	@Size(min = 5, max = 2000)
	private String link;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<Postagem> postagem;

	//Início getters and setters

	public String getNomeCompleto() {
		return nomeCompleto;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
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
	
	public List<Postagem> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<Postagem> postagem) {
		this.postagem = postagem;
	}
	
	//Fim getters and setters
}
