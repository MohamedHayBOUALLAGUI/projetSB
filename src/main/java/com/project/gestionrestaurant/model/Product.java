package com.project.gestionrestaurant.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name="product")
public class Product extends AbstractEntity{
	
	@Column(name="codeproduct")
	private String codeProduct;
	
	@Column(name="qtystock")
	private int qtyStock;
	
	@Column(name="prixunitaire")
	private double prixUnitaire;
	
	@Column(name="designation")
	private String designation;
	
	@Column(name="image")
	private String image;
	
	@ManyToOne
	@JoinColumn(name = "idcategory")
	private Category category;
	
	@OneToMany(mappedBy="product")
	private List<LigneCommande> lignecommandes;
	
	
}
