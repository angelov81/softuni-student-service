package bg.softuni.students.students;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentsController {

  @GetMapping("/students")
  public List<Student> findAll() {
    Student student1 = new Student().setId(1).setName("Pesho");
    Student student2 = new Student().setId(2).setName("Anna");

    return List.of(student1, student2);
  }

}
