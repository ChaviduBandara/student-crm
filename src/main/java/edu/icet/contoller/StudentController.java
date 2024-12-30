package edu.icet.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController     // must put this annotation if putting a network request (get,post,etc)
public class StudentController {

    @GetMapping("/get")
    public String getStudent(){
        return "Saman";
    }
}
