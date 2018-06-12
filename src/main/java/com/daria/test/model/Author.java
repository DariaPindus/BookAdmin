package com.daria.test.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

//@Entity
@NoArgsConstructor
public class Author implements IEntity {
    @Id
    @GeneratedValue
    private Long id;
    @NotEmpty
    @Getter @Setter private String lastName;
    @Getter @Setter private String firstName;

}
