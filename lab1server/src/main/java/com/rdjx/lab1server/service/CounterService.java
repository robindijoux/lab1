package com.rdjx.lab1server.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rdjx.lab1server.model.Counter;
import com.rdjx.lab1server.repository.CounterRepository;

@Service
public class CounterService {
    @Autowired public CounterRepository counterRepository;
    
    public Integer incrementCounter(){
        Counter counter = this.counterRepository.findById((long) 1).get();
        counter.setCounter_value(counter.getCounter_value()+1);
        return counter.getCounter_value();
    }
}
