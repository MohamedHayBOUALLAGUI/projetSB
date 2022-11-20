package com.project.gestionrestaurant.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
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
@Table(name="user")
public class User extends AbstractEntity{
	
	@Column(name="nom")
	private String nom;
	
	@Column(name="prenom")
	private String prenom;
	
	@Embedded
	private Address address;
	
	@Column(name="motdepasse")
	private String motDePasse;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="sexe")
	private String sexe;
	
	@Column(name="role")
	private String role;
	
	@Column(name="numTel")
	private String numTel;
	
	@Column(name="photo")
	private String photo;
	
	@OneToMany(mappedBy = "user")
	private List<Commande> commandes;
}
