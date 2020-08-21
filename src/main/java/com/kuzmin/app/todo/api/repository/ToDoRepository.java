package com.kuzmin.app.todo.api.repository;

import com.kuzmin.app.todo.api.domain.ToDo;
import org.springframework.data.repository.CrudRepository;

public interface ToDoRepository extends CrudRepository<ToDo,String> {
}
