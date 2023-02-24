package com.example.katamodule.repos;

import com.example.katamodule.model.Beer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface BeerRepository extends JpaRepository<Beer, Long>, JpaSpecificationExecutor<Beer> {

}