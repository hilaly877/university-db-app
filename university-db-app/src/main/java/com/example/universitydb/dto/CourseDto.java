package com.example.universitydb.dto;

import com.example.universitydb.model.Course;

public record CourseDto(String code, String title, Integer credits, String lecturer, String
department) {

    public static CourseDto from(Course c) {
        return new CourseDto(c.getCode(), c.getTitle(), c.getCredits(),
                c.getLecturer().getName(), c.getLecturer().getDepartment().getName());
    }
}