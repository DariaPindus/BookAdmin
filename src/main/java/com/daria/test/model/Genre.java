package com.daria.test.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

//@Entity
@NoArgsConstructor
public class Genre implements IEntity {
    @Id
    @GeneratedValue
    @Getter @Setter private Long id;

    @Column(unique = true)
    @NotBlank
    @Getter @Setter private String name;

    public Genre(String name) {
        this.name = name;
    }
}
