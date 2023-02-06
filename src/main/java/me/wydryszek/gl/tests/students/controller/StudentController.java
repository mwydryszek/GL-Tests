package me.wydryszek.gl.tests.students.controller;

import lombok.RequiredArgsConstructor;
import me.wydryszek.gl.tests.students.model.Student;
import me.wydryszek.gl.tests.students.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }

}
