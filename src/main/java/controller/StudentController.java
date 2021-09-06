package controller;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import service.StudentService;

import java.util.Map;


@Controller
@RequestMapping("/studentController")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/queryStuByStuNO/{stuno}")
    public String queryStudentByStuNO(@PathVariable("stuno") Integer StuNO, Map<String,Object> map){
        Student student = studentService.queryStuByStuNO(StuNO);
        map.put("student",student);
        return "result";
    }

}
