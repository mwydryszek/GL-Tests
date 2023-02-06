package me.wydryszek.gl.tests.students.repository;

import me.wydryszek.gl.tests.students.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student,Long> {

}
