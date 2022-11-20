package com.project.gestionrestaurant.dto;



import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.gestionrestaurant.model.Commande;
import com.project.gestionrestaurant.model.User;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDto {

	private Integer id;
	
	private String nom;
	
	
	private String prenom;
	

	private AddressDto addressDto;
	

	private String motDePasse;
	

	private String mail;
	

	private String sexe;
	

	private String role;
	

	private String numTel;
	

	private String photo;
	
	@JsonIgnore
	private List<Commande> commandes;
	
	
	public static UserDto fromEntity(User user) {
		
		if(user == null) {
			return null;
			//TODO throw an exception
		}
		return UserDto.builder()
				.id(user.getId())
				.nom(user.getNom())
				.prenom(user.getPrenom())
				.addressDto(AddressDto.fromEntity(user.getAddress()))
				.motDePasse(user.getMotDePasse())
				.mail(user.getMail())
				.sexe(user.getSexe())
				.role(user.getRole())
				.numTel(user.getNumTel())
				.photo(user.getPhoto())
				.build();
		
	}
	
	public static User toEntity(UserDto userDto) {
		
		if(userDto == null) {
			return null;
			//TODO
		}
		
		User user= new User();
		
		user.setId(userDto.getId());
		user.setNom(userDto.getNom());
		user.setPrenom(userDto.getPrenom());
		user.setAddress(AddressDto.toEntity(userDto.getAddressDto()));
		user.setMotDePasse(userDto.getMotDePasse());
		user.setMail(userDto.getMail());
		user.setSexe(userDto.getSexe());
		user.setRole(userDto.getRole());
		user.setNumTel(userDto.getNumTel());
		user.setPhoto(userDto.getPhoto());
		
		
		
		return user;
	
	}

}
