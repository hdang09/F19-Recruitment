/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hdang09.repositories;

import hdang09.entities.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public interface StudentRepository extends CrudRepository<Student, Integer> {

    Student getByStudentId(String studentId);
    
    Student getByPersonalEmail(String personalEmail);

    Student getByPhone(String phone);

    @Query("SELECT s FROM Student s")
    ArrayList<Student> getAllStudent();
}
