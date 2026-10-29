package com.example.universitydb.dto;

import com.example.universitydb.model.Lecturer;

public record LecturerDto(String name, String email, String department) {

    public static LecturerDto from(Lecturer l) {
        return new LecturerDto(l.getName(), l.getEmail(), l.getDepartment().getName());
    }
}
