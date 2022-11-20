package com.project.gestionrestaurant.dto;

import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;
import com.project.gestionrestaurant.model.Category;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CategoryDto {
	

	private Integer id;
	
	private String codeCat;
	
	private String designation;
	
	@JsonIgnore
	private List<ProductDto> products;
	
	
	public static CategoryDto fromEntity(Category category) {
		if(category ==null) {
			return null;
			//TODO throw an exception
		}
		
		//Category -> CategoryDto
		return CategoryDto.builder()
				.id(category.getId())
				.codeCat(category.getCodeCat())
				.designation(category.getDesignation())
				.build();
		
	}
	
	//CategoryDto -> Category
	public static Category toEntity(CategoryDto categoryDto) {
		if(categoryDto == null) {
			return null;
			//TODO throw an exception
		}
		
		Category category= new Category();
		
		category.setId(categoryDto.getId());
		category.setCodeCat(categoryDto.getCodeCat());
		category.setDesignation(categoryDto.getDesignation());
		return category;
	}

}
