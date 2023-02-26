package com.example.katamodule.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Styles")
public class Style {
    @Id
    @GeneratedValue
    private Long id;
    private String style_name;
    private LocalDate last_mod;
    @ManyToOne
    @JoinColumn(name="cat_id")
    @NotFound(action = NotFoundAction.IGNORE)
    private Category categories;
}
