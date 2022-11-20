package com.project.gestionrestaurant.dto;

import com.project.gestionrestaurant.model.Address;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AddressDto {

	
	//private Integer id;
	
	private String address1;
	
	
	private String address2;
	
	
	private String ville;
	
	
	private String codePostal;

	
	private String pays;
	
	public static AddressDto fromEntity(Address address) {
		
		if(address == null) {
			return null;
			//TODO throw an exception
		}
		
		return AddressDto.builder()
				.address1(address.getAddress1())
				.address2(address.getAddress2())
				.ville(address.getVille())
				.codePostal(address.getCodePostal())
				.pays(address.getPays())
				.build();
		
	}
	
	public static Address toEntity(AddressDto addressDto) {
		if(addressDto == null) {
			return null;
			//TODO throw an exception
		}
		Address address=new Address();
		
		address.setAddress1(addressDto.getAddress1());
		address.setAddress2(addressDto.getAddress2());
		address.setCodePostal(address.getCodePostal());
		address.setVille(address.getVille());
		address.setPays(address.getPays());
		return address;
		
		
		
		
	}

}
