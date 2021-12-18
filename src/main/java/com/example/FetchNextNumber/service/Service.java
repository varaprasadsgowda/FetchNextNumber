package com.example.FetchNextNumber.service;

import com.example.FetchNextNumber.model.returnObject;
import com.example.FetchNextNumber.model.table;
import com.example.FetchNextNumber.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;


@org.springframework.stereotype.Service
public class Service {

    @Autowired
    Repository repository;


    @PostConstruct
    public void run(){
        repository.save(new table(0,0));
        repository.save(new table(1,0));
        repository.save(new table(2,0));
        repository.save(new table(3,0));
        repository.save(new table(4,0));
        repository.save(new table(5,0));
        repository.save(new table(6,0));
        repository.save(new table(7,0));
        repository.save(new table(8,0));
        repository.save(new table(9,0));

    }


    public returnObject bissnessLogic(int id) {
        return null;
    }
}
