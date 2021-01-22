package com.ada.ADA.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


	@Entity
	@Table(name = "tb_tema")
	public class Tema {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) //É usado para aviso para o JPA para realizar a conversão de uma classe. 
	private long id_tema;
	
	@NotNull
	@Size(min = 2 , max = 50)
	private String descricaoTema; //Tema usado para descrever a postagem e pesquisa. Terá no máximo 50 caracteres. 
	
	@NotNull
	@Size(min = 2 , max = 50)
	private String descricaoDuvida; //Usado para pesquisar no fórum pesquisa de tópicos. Terá no máximo 50 caracteres. 
	
	@NotNull
	private boolean vaga; // Usado para pesquisar vagas de emprego na Rede Social. 
	
	@NotNull
	private boolean duvida; //Usado para checar se a usuária deseja postar no fórum pesquisa de tópicos.
		
	
//Início Getters and Setters
	
	public long getId_tema() {
		return id_tema;
	}

	public void setId_tema(long id_tema) {
		this.id_tema = id_tema;
	}
		
	public String getDescricaoTema() {
		return descricaoTema;
	}

	public void setDescricaoTema(String descricaoTema) {
		this.descricaoTema = descricaoTema;
	}
	
	public boolean isVaga() {
		return vaga;
	}
	
	public void setVaga(boolean vaga) {
		this.vaga = vaga;
	}
	
	public String getDescricaoDuvida() {
		return descricaoDuvida;
	}
	
	public void setDescricaoDuvida(String descricaoDuvida) {
		this.descricaoDuvida = descricaoDuvida;
	}
	
	public boolean isDuvida() {
		return duvida;
	}
	
	public void setDuvida(boolean duvida) {
		this.duvida = duvida;
	}
	
//Fim Getters and Setters
	
	
}