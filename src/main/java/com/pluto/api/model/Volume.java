package com.pluto.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "volumes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Volume {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_volume;

    @Column(name = "name", length = 15)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column
    private String image;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "volume", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "volume", "characters"})
    private List<Chapter> chapters;

}
