package edu.icet.contoller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController     // must put this annotation if putting a network request (get,post,etc)
public class StudentController {

    @Autowired
    StudentService service;     // student service kiyana interface eken object ekak hadanna bane, eka nisa spring boot interface eka implements karapu sub class eka hoyagana gihilla eken object ekak handala denwa

    @GetMapping("/")
    public List<Student> getStudents(){
        return service.getStudent();
    }


}
