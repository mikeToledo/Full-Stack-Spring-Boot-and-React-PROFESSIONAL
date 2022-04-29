package com.example.demo.student;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/students")
@AllArgsConstructor
public class StudentController<student> {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
//        List<Student> students = Arrays.asList(
//                new Student(1L,
//                        "Esther",
//                        "esther@gmail.com",
//                        Gender.FEMALE),
//                new Student(2L,
//                        "Salvador",
//                        "salvador@gmail.com",
//                        Gender.MALE)
//        );
        //throw new IllegalStateException("oops error");
        return studentService.getAllStudents();
    }

    @PostMapping
    public void addStudent(@Valid @RequestBody Student student) {
        System.out.println("student "+student);
        // check if email is taken
        studentService.addStudent(student);
    }

    @DeleteMapping(path = "{studentId}")
    public void deleteStudent(@PathVariable("studentId") Long studentId) {
        // check if student exists
        studentService.addDelete(studentId);
    }
}
