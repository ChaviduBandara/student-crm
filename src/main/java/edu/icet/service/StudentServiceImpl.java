package edu.icet.service;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{

    StudentRepository repository;


    // ** Doing a CRUD with the DB **
    @Override
    public List<Student> getStudent() {    //To print the students from the DB (reading)
        List<Student> all = repository.findAll();   // findAll() => SELECT * FROM student
        return all;
    }
 
    @Override
    public void addStudent(Student student) {   //To add a student to the DB (updating)
        repository.save(student);   // short form of => (INSERT INTO student, VALUES (*****);
    }
}
