/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.g8.repositories;

import com.example.g8.entities.User;
import com.example.g8.repositoriesCrud.UserCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    
    @Autowired
    private UserCrudRepository repository;
    
    public List<User> getAll(){
        return (List<User>) repository.findAll();
    }
    
    public Optional<User> getUser(int id){
        return repository.findById(id);
    }
    
    public User save(User user){
        
        return repository.save(user);
    }
    
    
    
    public void deleteUser(User userDelete){
        repository.delete(userDelete);
    }
}
