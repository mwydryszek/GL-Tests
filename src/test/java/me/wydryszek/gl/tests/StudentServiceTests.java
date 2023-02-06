package me.wydryszek.gl.tests;

import me.wydryszek.gl.tests.students.model.Student;
import me.wydryszek.gl.tests.students.repository.StudentRepository;
import me.wydryszek.gl.tests.students.service.StudentService;
import org.hamcrest.Matchers;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@RunWith(MockitoJUnitRunner.class)
public class StudentServiceTests {


    @Mock
    StudentRepository studentRepository;

    @InjectMocks
    StudentService studentService;

    @Before
    public void setup(){

        given(studentRepository.findAll()).willReturn(prepareMockData());
    }

    @Test
    public void getStudents(){

        //when
        List<Student> students = studentService.getStudents();

        //then
        assertThat(students, Matchers.hasSize(3));
    }

    @Test
    public void addStudent(){

        //given
        Student student = Student.builder().firstName("Marek").lastName("Lis").build();
        given(studentRepository.save(any(Student.class))).willReturn(student);

        //when
        Student returnedStudent = studentService.addStudent(student);

        //then
        assertThat(returnedStudent, Matchers.equalTo(student));
    }

    private List<Student> prepareMockData(){
        return List.of(
                Student.builder()
                        .firstName("Matesz")
                        .lastName("Wydryszek").build(),
                Student.builder()
                        .firstName("Jan")
                        .lastName("Kowalski").build(),
                Student.builder()
                        .firstName("Piotr")
                        .lastName("Nowak").build());
    }

}
