package com.daria.test.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

//@Entity
public class BookOrder implements IEntity {

    @Getter @Setter private Long id;
    @NotEmpty
    private User user;



}
