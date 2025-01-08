package org.prince.springsecex.Controller;

import jakarta.servlet.http.HttpServletRequest;
<<<<<<< Updated upstream
import org.prince.springsecex.model.Student;
=======
import org.prince.springsecex.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> Stashed changes
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

<<<<<<< Updated upstream
    private List<Student> students = new ArrayList<>(List.of(
            new Student(1, "Prince", 70),
            new Student(2, "Dinesh", 55),
            new Student(3, "Shubham", 87)
    ));
=======
    // create a mutable list of students
//    private List<Users.Student> students = new ArrayList<>()
//    {{
//        add(new Users.Student(1, "John Doe", 90));
//        add(new Users.Student(2, "Jane Doe", 80));
//        add(new Users.Student(3, "Alice", 70));
//        add(new Users.Student(4, "Bob", 60));
//    }};
>>>>>>> Stashed changes

    @Autowired
    public
    @GetMapping("/students")
<<<<<<< Updated upstream
    public List<Student> getStudents(){
       return students;
=======
    public List<Users.Student> getStudents() {
        return students;
>>>>>>> Stashed changes
    }

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest request){
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @PostMapping("/students")
<<<<<<< Updated upstream
    public Student addStudent(@RequestBody Student student){
=======
    public Users.Student addStudent(@RequestBody Users.Student student) {
>>>>>>> Stashed changes
        students.add(student);
        return student;
    }
}
