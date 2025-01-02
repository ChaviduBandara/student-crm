package edu.icet.service.impl;

import edu.icet.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    public String getStudent(){
        return "Kamal";
    }
}
