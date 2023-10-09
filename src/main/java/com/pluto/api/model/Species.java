package com.pluto.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "species")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Species {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_species;

    @Column(length = 15)
    private String name_species;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "species", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "species"})
    private List<Character> characters;
}
