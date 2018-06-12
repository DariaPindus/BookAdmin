package com.daria.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;
import java.util.Optional;

@NoRepositoryBean
public interface AbstractRepository<T extends Serializable, ID extends Serializable> extends JpaRepository<T, ID>,
        JpaSpecificationExecutor
{
    Optional<T> findOneById(ID id);
}