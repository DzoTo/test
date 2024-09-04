package com.example.springboottutorial2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // http://localhost:8080/student
    @GetMapping("/students")
    public List<Student> getStudent() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ramazan", "Roma"));
        students.add(new Student("Nurasyl", "Nura"));
        students.add(new Student("Adi", "Kek"));
        students.add(new Student("Neibarys", "beiba"));
        return students;
    }

    @GetMapping("/student/{name}/{surname}")
    public Student createStudentWithPath(@PathVariable("name") String name,
                                         @PathVariable("surname") String surname){
        return new Student(name, surname);
    }
}