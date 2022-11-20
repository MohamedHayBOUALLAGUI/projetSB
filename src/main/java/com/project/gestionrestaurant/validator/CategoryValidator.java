package com.project.gestionrestaurant.validator;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.StringUtils;

import com.project.gestionrestaurant.dto.CategoryDto;

public class CategoryValidator {
	
	
	public static List<String> validate(CategoryDto categoryDto){
		
		List<String> errors=new ArrayList<>();
		
		if(categoryDto == null || !StringUtils.hasLength(categoryDto.getCodeCat())) {
			errors.add("Veuillez renseigner le code de la catégorie!");
		}
		
		return errors;
	}
	
	
	
}
