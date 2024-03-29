/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.g8.controller;

import com.example.g8.entities.Clothe;
import com.example.g8.services.ClotheService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/clothe")
@CrossOrigin(origins = "*")
public class ClothesController {
    
    @Autowired
    private ClotheService service;
    
    @GetMapping("/all")
    public List<Clothe> getAll(){
        return service.getAllClothe();
    }
    
    
    
    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public Clothe clotheNew(@RequestBody Clothe clotheNew){
        return service.createClothe(clotheNew);
    }
    
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Clothe editclothe(@RequestBody Clothe clothe){
        return service.update(clothe);
    }
    
    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCategory(@PathVariable("reference") String categoryId){
       //return 
       service.delete(categoryId);
        
    }
}

