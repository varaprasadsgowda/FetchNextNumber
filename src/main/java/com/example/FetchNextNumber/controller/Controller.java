package com.example.FetchNextNumber.controller;

import com.example.FetchNextNumber.model.returnObject;
import com.example.FetchNextNumber.model.table;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/FetchNextNumber/{id}")
    @ResponseBody
    public returnObject updateTable(@PathVariable int id){
        returnObject obj = new returnObject("a","b");
        System.out.println(id);
        return obj;

    }

}
