package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;

public interface StudentService {
    public void add(String data);

    List<Student> getStudent();
}
