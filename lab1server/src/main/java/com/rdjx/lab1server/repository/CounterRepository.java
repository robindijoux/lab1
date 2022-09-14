package com.rdjx.lab1server.repository;

import org.springframework.data.repository.CrudRepository;

import com.rdjx.lab1server.model.Counter;

public interface CounterRepository extends CrudRepository<Counter,Long> {
    
}
