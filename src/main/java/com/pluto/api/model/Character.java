package com.pluto.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "characters")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Character implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_character;

    @Column(name = "name", length = 85)
    private String character_name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "image")
    private String image_name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_gender")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_species")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Species species;

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}
