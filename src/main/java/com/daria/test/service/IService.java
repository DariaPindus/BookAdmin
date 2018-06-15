package com.daria.test.service;

import com.daria.test.model.IEntity;

import java.util.List;
import java.util.Optional;

public interface IService<E extends IEntity, ID > {
    E save(E entity);
    E update(E entity);
    E delete(E entity);
    E deleteById(ID id);
    List<E> findAll();
    Optional<E> findById(ID id);
}

