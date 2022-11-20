package com.project.gestionrestaurant.dto;

import java.util.List;

import com.project.gestionrestaurant.model.Product;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDto {


	private Integer id;
	
	private String codeProduct;
	

	private int qtyStock;
	

	private double prixUnitaire;
	

	private String designation;
	

	private String image;
	

	private CategoryDto category;
	

	private List<LigneCommandeDto> lignecommandes;
	
	
	public static ProductDto fromEntity(Product product) {
		
		if(product == null) {
			return null;
			//TODO throw an exception
		}
		return ProductDto.builder()
				.id(product.getId())
				.codeProduct(product.getCodeProduct())
				.qtyStock(product.getQtyStock())
				.prixUnitaire(product.getPrixUnitaire())
				.designation(product.getDesignation())
				.image(product.getImage())
				.build();
		
	}
	
	public static Product toEntity(ProductDto productDto) {
		
		if(productDto == null) {
			return null;
			//TODO
		}
		
		Product product= new Product();
		
		product.setId(productDto.getId());
		product.setCodeProduct(productDto.getCodeProduct());
		product.setQtyStock(productDto.getQtyStock());
		product.setPrixUnitaire(productDto.getPrixUnitaire());
		product.setDesignation(productDto.getDesignation());
		product.setImage(productDto.getImage());
		
		
		
		return product;
	
	}
	
	
	
}
