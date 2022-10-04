package com.Hmidi.gestiondestock.model;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Embeddable
public class Adresse {
	
	private String adresse1; 
	
	private String adresse2;
	
	private String ville;
	
	private String codePostale;
	
	private String adresse2;
	
	

}
