package com.example.katamodule.repos;

import com.example.katamodule.model.Brewery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface BreweryRepository extends JpaRepository<Brewery, Long>, JpaSpecificationExecutor<Brewery> {

}
