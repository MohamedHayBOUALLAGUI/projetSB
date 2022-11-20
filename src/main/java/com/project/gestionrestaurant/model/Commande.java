package com.project.gestionrestaurant.model;

import java.util.Date;
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
@Table(name="commande")
public class Commande extends AbstractEntity{
	
	@Column(name="code")
	private String code;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="etatcommande")
	private String etat;
	
	@ManyToOne
	@JoinColumn(name="iduser")
	private User user;
	
	@OneToMany(mappedBy="commande")
	private List<LigneCommande> ligneCommandes;

}
