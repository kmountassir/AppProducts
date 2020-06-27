package org.iga.appproduit.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity @Data @NoArgsConstructor @AllArgsConstructor
public class Product {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ref;
	private String description;
	private Double unitPrice;
}
