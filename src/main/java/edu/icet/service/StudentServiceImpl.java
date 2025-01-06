package edu.icet.service;

import edu.icet.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
        public void add(String data){
            System.out.println(data);
    }

    @Override
    public List<Student> getStudent() {
        ArrayList<Student> stdList = new ArrayList<>();
        stdList.add(new Student(1, "Kamal", "Kegalle"));
        stdList.add(new Student(2, "Sunil", "Hettimulla"));
        stdList.add(new Student(3, "Wimal", "Wattala"));
        stdList.add(new Student(4, "Nimal" , "Panadura"));
        return stdList;
    }
}
