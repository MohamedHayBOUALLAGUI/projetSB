package com.project.gestionrestaurant.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.gestionrestaurant.model.Commande;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CommandeDto {

	private Integer id;
	
	private String code;

	private Date date;
	
	private String etat;
	
	private UserDto user;
	
	@JsonIgnore
	private List<LigneCommandeDto> ligneCommandes;
	
	public static CommandeDto fromEntity(Commande commande) {
		
		if(commande == null) {
			return null;
			//TODO throw an exception
		}
		return CommandeDto.builder()
				.id(commande.getId())
				.code(commande.getCode())
				.date(commande.getDate())
				.etat(commande.getEtat())
				//.user(commande.getUser())
				.build();
		
	}
	
	public static Commande toEntity(CommandeDto commandeDto) {
		
		if(commandeDto == null) {
			return null;
			//TODO
		}
		
		Commande commande= new Commande();
		
		commande.setCode(commandeDto.getCode());
		commande.setEtat(commande.getEtat());
		commande.setDate(commandeDto.getDate());
		
		
		return commande;
	
	}
	

}
