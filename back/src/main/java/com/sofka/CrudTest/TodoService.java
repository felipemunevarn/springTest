package com.sofka.CrudTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

    @Autowired
    private TodoRepository repo;

    public Iterable<Todo> list(){
        return repo.findAll();
    }

    public Todo save(Todo todo){
        return repo.save(todo);
    }

    public void delete(Long id){
        repo.delete(get(id));
    }

    public Todo get(Long id){
        return repo.findById(id).orElseThrow();
    }
}
