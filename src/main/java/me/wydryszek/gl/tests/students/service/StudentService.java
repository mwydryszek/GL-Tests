package me.wydryszek.gl.tests.students.service;

import lombok.RequiredArgsConstructor;
import me.wydryszek.gl.tests.students.model.Student;
import me.wydryszek.gl.tests.students.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService{

    private final StudentRepository studentRepository;


    public List<Student> getStudents() {
        List<Student> list = new ArrayList<>();
        studentRepository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    public Student addStudent(Student studentEntity) {
        return studentRepository.save(studentEntity);
    }

}
