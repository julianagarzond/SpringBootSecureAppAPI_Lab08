package com.eci.cosw.springbootsecureapi.controller;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(value="/api")
public class TaskController {

    @Autowired
    TaskService ts;

    @GetMapping("/tasks")
    List<Task> getAllTasks(){
        return ts.getAllTasks();
    }

    @PostMapping("/newTask")
    Task createTask(@RequestBody Task newTask){
        return ts.createTask(newTask);
    }


}
