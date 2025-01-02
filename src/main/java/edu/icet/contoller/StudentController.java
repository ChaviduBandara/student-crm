package edu.icet.contoller;

import edu.icet.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     // must put this annotation if putting a network request (get,post,etc)
public class StudentController {

    @Autowired
    StudentService service;

    @GetMapping("/get")
    public String getStudent(){
        return service.getStudent();
    }
}
