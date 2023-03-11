package com.example.Deployement.controller;

import com.example.Deployement.model.Todo;
import com.example.Deployement.repository.ITodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/todo")
public class TodoController {
    @Autowired
    ITodoRepository iTodoRepository;
    @PostMapping(value = "saveTodo")
    public ResponseEntity<String> saveTodo(@RequestBody Todo newTodo){
        Todo todo = iTodoRepository.save(newTodo);
        return new ResponseEntity<>(todo.toString(), HttpStatus.CREATED);
    }
    @GetMapping(value = "getTodo")
    public ResponseEntity<String> getTodo(){
        List<Todo> todo = iTodoRepository.findAll();
        return new ResponseEntity<>(todo.toString(), HttpStatus.OK);
    }

}
