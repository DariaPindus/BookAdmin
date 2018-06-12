package com.daria.test.model;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public interface IEntity extends Serializable{
    Long getId();
}
