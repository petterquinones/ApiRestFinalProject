package com.apirest.ApiRestProyectoFinal.domain.model.student.attributes;

public class StudentId {
    //Declaration de value
    private final Long value;

    //Constructor
    public StudentId(Long value) {
        this.value = value;
    }

    //Getter
    public Long getValue() {
        return value;
    }
}
