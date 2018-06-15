package com.daria.test.repository;


import com.daria.test.model.IEntity;

import java.util.Optional;

public interface IRepository<E extends IEntity, Id> {
    E save();
    Optional<E> findAll();
}
