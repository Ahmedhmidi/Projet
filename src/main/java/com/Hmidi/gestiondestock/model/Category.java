package com.Hmidi.gestiondestock.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.swing.table.AbstractTableModel;

import antlr.collections.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "category")

public class Category extends AbstractEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "code")
	private String code; 
	
	@Column(name = "designation")
	private String designation;
	
	@OneToMany(mappedBy = "category")
	private List articles; 
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category; 

}
