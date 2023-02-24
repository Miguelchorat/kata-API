package com.example.katamodule.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "Beers")
public class Beer {

	@Id @GeneratedValue
	private Long id;
	
	private String name;
	
	private String descript;
	
	private Long abv;

	private Long ibu;

	private Long srm;
	private Long upc;
	private String filepath;
	private Long add_user;
	private LocalDate last_mod;
	
	@ManyToOne
	@JoinColumn(name="brewery_id")
	private Brewery breweries;
	
}
