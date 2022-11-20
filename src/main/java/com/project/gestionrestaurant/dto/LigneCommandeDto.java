package com.project.gestionrestaurant.dto;



import com.project.gestionrestaurant.model.LigneCommande;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LigneCommandeDto {
	

	private Integer id;
	
	private int quantite;
	
	
	//private double prixUnitaire;
	

	private CommandeDto commande;
	

	private ProductDto product;


	public static LigneCommandeDto fromEntity(LigneCommande ligneCommande) {
		if(ligneCommande == null) {
			return null;
		}
		
		return LigneCommandeDto.builder()
				.id(ligneCommande.getId())
				.quantite(ligneCommande.getQuantite())
				.build();

	}
	
	public static LigneCommande toEntity(LigneCommandeDto ligneCommandeDto) {
		
		if(ligneCommandeDto == null) {
			return null;
			//TODO
		}
		
		LigneCommande ligneCommande= new LigneCommande();
		
		ligneCommande.setId(ligneCommandeDto.getId());
		ligneCommande.setQuantite(ligneCommandeDto.getQuantite());
		
		
		return ligneCommande;
	
	}
	
}
