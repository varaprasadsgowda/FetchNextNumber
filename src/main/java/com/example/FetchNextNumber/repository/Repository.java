package com.example.FetchNextNumber.repository;


import com.example.FetchNextNumber.model.table;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface Repository extends JpaRepository<table,String> {

}
