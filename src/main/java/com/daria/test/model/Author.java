package com.daria.test.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@NoArgsConstructor
public class Author implements IEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter private Long id;
    @NotEmpty
    @Getter @Setter private String lastName;
    @Getter @Setter private String firstName;

    public Author(@NotEmpty String lastName, String firstName) {
        this.lastName = lastName;
        this.firstName = firstName;
    }
}
