package com.project.gestionrestaurant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name="lignescommande")

public class LigneCommande extends AbstractEntity{
	
	@Column(name="quantite")
	private int quantite;
	
	
	//@Column(name="prixunitaire")
	//private double prixUnitaire;
	
	@ManyToOne
	@JoinColumn(name="idcommande")
	private Commande commande;
	
	@ManyToOne
	@JoinColumn(name="idproduct")
	private Product product;

	
}
