package com.apirest.ApiRestProyectoFinal.domain.model.student;

import com.apirest.ApiRestProyectoFinal.domain.model.student.attributes.StudentEmail;
import com.apirest.ApiRestProyectoFinal.domain.model.student.attributes.StudentId;
import com.apirest.ApiRestProyectoFinal.domain.model.student.attributes.StudentName;
import com.apirest.ApiRestProyectoFinal.domain.model.student.attributes.StudentPhone;

public class Student {

    //Declaration de variables ValueObjects
    private final StudentId id;
    private final StudentName name;
    private final StudentPhone phone;
    private final StudentEmail email;

    //Constructors
    public Student(StudentId id, StudentName name, StudentPhone phone, StudentEmail email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    //Getters
    public StudentId getId() {
        return id;
    }

    public StudentName getName() {
        return name;
    }

    public StudentPhone getPhone() {
        return phone;
    }

    public StudentEmail getEmail() {
        return email;
    }
}
