package com.example.spring_data_jpa_ex.repository;

import com.example.spring_data_jpa_ex.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // by using annotation Query
//    @Query("select s from Student s where s.name = ?1")
//    List<Student> findByName(String name);

    // directly JPA will do by DSL: Domain Specific language  (By field name)
    List<Student> findByName(String name);
//    List<Student> findByMarks(int marks);

    List<Student> findByMarksGreaterThan(int marks);


}
