package com.eci.cosw.springbootsecureapi.service;

import com.eci.cosw.springbootsecureapi.model.Task;

import java.util.List;

public interface TaskService {
    public List<Task> getAllTasks();
    public Task getTaskByEmail(String email);
    public Task createTask(Task newTask);
    public Task updateTask(Task newTask);
    public void removeTask(Task id);
}
