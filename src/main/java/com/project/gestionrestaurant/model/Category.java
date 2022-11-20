package com.project.gestionrestaurant.model;

import java.util.List;

import javax.persistence.Column;
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
@Table(name="category")
public class Category extends AbstractEntity {

		@Column(name="code")
		private String codeCat;
		
		@Column(name="designation")
		private String designation;
		
		@OneToMany(mappedBy = "category")
		private List<Product> products;
}
