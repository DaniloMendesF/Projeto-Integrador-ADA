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
	@GeneratedValue (strategy = GenerationType.IDENTITY) //É usado para avisar o JPA realizar a conversão de uma classe. 
	private long id_tema;
		
	@NotNull
	@Size(min = 2 , max = 50)
	private String descricaoTema; //Tema usado para descrever a postagem e pesquisa. Terá no máximo 50 caracteres. 
		
	@NotNull
	@Size(min = 1, max = 50)
	private String tipoTema; // vaga, duvida

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

public String getTipoTema() {
	return tipoTema;
}

public void setTipoTema(String tipoTema) {
	this.tipoTema = tipoTema;
}
	
//Fim Getters and Setters
	
	
}