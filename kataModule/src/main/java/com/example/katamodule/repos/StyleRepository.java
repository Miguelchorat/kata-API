package com.example.katamodule.repos;

import com.example.katamodule.model.Style;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StyleRepository extends JpaRepository<Style, Long>, JpaSpecificationExecutor<Style> {
}
