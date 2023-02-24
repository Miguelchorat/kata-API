package com.example.katamodule.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data @NoArgsConstructor @AllArgsConstructor
@Entity
@Table(name = "Breweries")
public class Brewery {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String address1;
    private String address2;
    private String city;
    private String state;
    private String code;
    private String country;
    private String phone;
    private String website;
    private String filepath;
    private String descript;
    private Long add_user;
    private LocalDate last_mod;
}
