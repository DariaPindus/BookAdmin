package com.daria.test.service;

import com.daria.test.model.IEntity;

import java.io.Serializable;
import java.util.Optional;

public interface AbstractService<E extends IEntity, ID > {
    E save(E entity);
    E delete(E entity);
    E deleteById(ID key);
    E update(E entity);
    Iterable<E> getAllItems();
    Optional<E> findById(ID id);
}

