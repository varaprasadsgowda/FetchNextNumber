package com.example.FetchNextNumber.service;

import com.example.FetchNextNumber.model.returnObject;
import com.example.FetchNextNumber.model.table;
import com.example.FetchNextNumber.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {

    Repository repository;

    @Autowired
    Service(Repository repository){
        this.repository = repository;
    }

    public returnObject bissnessLogic(int id){
        table oldEntry = repository.getById(String.valueOf(id));


        return null;
    }
}
