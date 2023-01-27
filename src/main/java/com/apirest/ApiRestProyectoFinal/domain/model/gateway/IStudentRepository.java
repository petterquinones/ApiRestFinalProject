package com.apirest.ApiRestProyectoFinal.domain.model.gateway;

import com.apirest.ApiRestProyectoFinal.domain.model.student.Student;

import java.util.List;

public interface IStudentRepository {
    //Crud
    Student saveStudent(Student student); //Create

    List<Student> findAllStudent();//Read-All

    List<Student> findStudentById(Long id); //Read

    Student updateStudent(Student student); //Update

    String deleteStudent(Long id); //Delete

}
