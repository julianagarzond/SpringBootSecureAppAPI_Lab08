package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;
import com.eci.cosw.springbootsecureapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {
    private List<Task> tasks = new ArrayList<>();
    @Autowired
    public TaskServiceImpl()
    {
    }

    @PostConstruct
    private void populateSampleData()
    {
        tasks.add( new Task( "1", "create task view", "Juliana", "juligardu@gmail.com","Reaady", new Date()) );
    }
    @Override
    public List<Task> getAllTasks() {
        return tasks;
    }

    @Override
    public Task getTaskByEmail(String email) {
     Task task=null;
     for(int i=0; i<tasks.size();i++){
         if (tasks.get(i).getEmail().equals(email)){
             task=tasks.get(i);
         }
     }
     return task;
    }

    @Override
    public Task createTask(Task newTask) {
        tasks.add(newTask);
        return newTask;
    }

    @Override
    public Task updateTask(Task newTask) {
        return null;
    }

    @Override
    public void removeTask(Task id) {
        for(int i=0 ;i<tasks.size();i++){
            if (tasks.get(i).getId().equals(id)){
                tasks.remove(tasks.get(i));
            }
        }
    }
}
