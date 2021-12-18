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

    // initial state of the table
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


    public returnObject bussnessLogic(int id) {
        table currentState = repository.getById(id);

        int currentValue = currentState.getValue();
        int nextValue = currentValue+1;
        int category = id;

        // that give next number with same category
        while(category != digSum(nextValue)){
            nextValue++;
        }


        table nextState = new table(category,nextValue);
        repository.save(nextState);

        return new returnObject(currentValue,nextValue);
    }
    // Helper function that calculate the digit sum
    private int digSum(int n){
        if(n==0)return 0;
        return  (n % 9 ==0) ? 9 : (n % 9);
    }
}
