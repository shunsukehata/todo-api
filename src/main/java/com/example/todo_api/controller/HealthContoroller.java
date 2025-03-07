package com.example.todo_api.controller;

import com.example.todo.api.controller.HealthApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthContoroller implements HealthApi {

    @Override
    public ResponseEntity<Void> healthGet() {
        return ResponseEntity.ok().build();
    }
}
