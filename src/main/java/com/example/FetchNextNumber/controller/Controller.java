package com.example.FetchNextNumber.controller;

import com.example.FetchNextNumber.model.returnObject;
import com.example.FetchNextNumber.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    Service service;

    @Autowired
    Controller(Service service){
        this.service = service;
    }

    @GetMapping("/FetchNextNumber/{id}")
    public ResponseEntity<returnObject>  updateTable(@PathVariable("id") int id){

        returnObject ans = service.bussnessLogic(id);
        return new ResponseEntity<>(ans,HttpStatus.OK);
    }

}
