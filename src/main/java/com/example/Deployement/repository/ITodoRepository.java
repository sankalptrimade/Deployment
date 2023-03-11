package com.example.Deployement.repository;

import com.example.Deployement.model.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITodoRepository extends JpaRepository<Todo, Integer> {
}
