package com.daria.test.model;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;


public interface IEntity extends Serializable{
    Long getId();
}
