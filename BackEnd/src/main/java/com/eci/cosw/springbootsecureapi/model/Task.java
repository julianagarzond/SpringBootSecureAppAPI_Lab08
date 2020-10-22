package com.eci.cosw.springbootsecureapi.model;

import com.sun.javafx.beans.IDProperty;

import java.util.Date;
import java.util.List;

public class Task {
    private String id;
    private String description;
    private String responsable;
    private String email;
    private String status;
    private Date dueDate;

    public Task(String id,String description, String responsable, String email, String status, Date dueDate) {
        this.id=id;
        this.description = description;
        this.responsable = responsable;
        this.email = email;
        this.status = status;
        this.dueDate = dueDate;
    }

    public String getId(){
        return id;
    }

    public void  setId(String id){
        this.id=id;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
