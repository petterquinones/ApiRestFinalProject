package com.apirest.ApiRestProyectoFinal.domain.model.gateway;

import com.apirest.ApiRestProyectoFinal.domain.model.course.Course;

import java.util.List;

public interface ICourseRepository {
    //Crud
    Course saveCourse(Course course); //Create

    List<Course> findAllCourse();//Read-All

    List<Course> findCourseById(Long id); //Read

    Course updateCourse(Course course); //Update

    String deleteCourse(Long id); //Delete

}
