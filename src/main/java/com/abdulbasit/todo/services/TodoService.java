package com.abdulbasit.todo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.abdulbasit.todo.models.Todo;
import com.abdulbasit.todo.repository.TodoRepository;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> getTodos() {
        return todoRepository.findAll();
    }

    public ResponseEntity<Todo> getTodoById(Long id) {
        Optional<Todo> todo = todoRepository.findById(id);
        return todo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

}
