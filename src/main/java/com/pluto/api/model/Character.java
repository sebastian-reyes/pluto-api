package com.pluto.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

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
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "characters", "id_gender"})
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_status")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "characters", "id_status"})
    private Status status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_species")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "characters", "id_species"})
    private Species species;

    @ManyToMany(mappedBy = "characters")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "volume", "characters"})
    private List<Chapter> chapters;

    /**
     *
     */
    private static final long serialVersionUID = 1L;
}
