package com.daria.test.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BookOrder implements IEntity {
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Getter private Long id;
    @NotBlank
    @Getter @Setter private String firstName;
    @NotBlank
    @Getter @Setter private String lastName;
    @NotNull
    @Embedded
    @Getter @Setter private Address address;

}
