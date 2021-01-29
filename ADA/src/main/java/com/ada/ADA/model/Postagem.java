package com.ada.ADA.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagem")
public class Postagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_postagem; // Identificador único da postagem
	
	@NotNull
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Usuario usuario_id; // Chave estrangeira com o numero do usuário
	
	@NotNull
	@ManyToOne
	@JsonIgnoreProperties("tema")
	private Tema tema_id; // Chave estrangeira com o numero do tema
	
	@NotNull
	@Size(min = 2 , max = 2000)
	private String descricao_postagem; // Local para escrita das informações das usuárias na rede social. Terá no máximo 2000 caracteres. 
	
	@NotNull
	@Temporal(TemporalType.TIMESTAMP) // Anotation utilizado para adição de uma data. TIMESTAMP = data e hora
	private Date dataHora = new java.sql.Date(System.currentTimeMillis()); // Informará a data/hora das postagens.
	
	@Size(min = 5, max = 2000)
	private String link;
	
	//Início dos getters e setters
	
	public String getDescricao_postagem() {
		return descricao_postagem;
	}
	public long getId_postagem() {
		return id_postagem;
	}
	public void setId_postagem(long id_postagem) {
		this.id_postagem = id_postagem;
	}
	public Usuario getUsuario_id() {
		return usuario_id;
	}
	public void setUsuario_id(Usuario usuario_id) {
		this.usuario_id = usuario_id;
	}
	public Tema getTema_id() {
		return tema_id;
	}
	public void setTema_id(Tema tema_id) {
		this.tema_id = tema_id;
	}
	public void setDescricao_postagem(String descricao_postagem) {
		this.descricao_postagem = descricao_postagem;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	
	//Fim dos getters e setters
}
