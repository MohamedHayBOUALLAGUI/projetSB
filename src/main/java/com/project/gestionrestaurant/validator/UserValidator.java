package com.project.gestionrestaurant.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.project.gestionrestaurant.dto.UserDto;



public class UserValidator {
	
public static List<String> validate(UserDto userDto){
		
		List<String> errors=new ArrayList<>();
		
		//userDto == null 
		if(userDto == null) {
			errors.add("Veuillez renseigner le nom d'utilisateur!");
			errors.add("Veuillez renseigner le prenom d'utilisateur!");
			errors.add("Veuillez renseigner le mot de passe d'utilisateur!");
			errors.add("Veuillez renseigner l'adresse d'utilisateur!");
		}
		if( !StringUtils.hasLength(userDto.getNom())) {
			errors.add("Veuillez renseigner le nom d'utilisateur!");
		}
		if( !StringUtils.hasLength(userDto.getPrenom())) {
			errors.add("Veuillez renseigner le prenom d'utilisateur!");
		}
		if( !StringUtils.hasLength(userDto.getMotDePasse())) {
			errors.add("Veuillez renseigner le mot de passe d'utilisateur!");
		}
		if(userDto.getAddressDto() == null) {
			errors.add("Veuillez renseigner l'adresse d'utilisateur!");
		}else {
			if( !StringUtils.hasLength(userDto.getAddressDto().getAddress1())) {
				errors.add("Le champ 'Adresse 1' est obligatoir!");
			}
			if( !StringUtils.hasLength(userDto.getAddressDto().getVille())) {
				errors.add("Le champ 'Ville' est obligatoir!");
			}
			if( !StringUtils.hasLength(userDto.getAddressDto().getCodePostal())) {
				errors.add("Le champ 'Code Postal' est obligatoir!");
			}
			if( !StringUtils.hasLength(userDto.getAddressDto().getPays())) {
				errors.add("Le champ 'Pays' est obligatoir!");
			}
			
			
			
			
			
			
		}
		if( !StringUtils.hasLength(userDto.getNom())) {
			errors.add("Veuillez renseigner le nom d'utilisateur!");
		}
		return errors;
	}
	

}
