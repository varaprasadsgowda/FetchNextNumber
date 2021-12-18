package com.example.FetchNextNumber.controller;

import com.example.FetchNextNumber.model.returnObject;
import com.example.FetchNextNumber.model.table;
import com.example.FetchNextNumber.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    Service service;

    @Autowired
    Controller(Service service){
        this.service = service;
    }

    @GetMapping("/FetchNextNumber/{id}")
    public ResponseEntity<returnObject>  updateTable(@PathVariable int id){

        returnObject ans = service.bissnessLogic(id);
        return new ResponseEntity<>(ans,HttpStatus.OK);
    }

}
