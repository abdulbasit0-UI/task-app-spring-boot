package com.abdulbasit.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abdulbasit.todo.models.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
