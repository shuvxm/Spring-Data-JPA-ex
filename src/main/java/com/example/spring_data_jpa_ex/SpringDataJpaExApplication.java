package com.example.spring_data_jpa_ex;

import com.example.spring_data_jpa_ex.model.Student;
import com.example.spring_data_jpa_ex.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaExApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringDataJpaExApplication.class, args);

		StudentRepository repo = context.getBean(StudentRepository.class);

		Student s1 = context.getBean(Student.class);
		Student s2 = context.getBean(Student.class);
		Student s3 = context.getBean(Student.class);

//		s1.setRollNo(101);
//		s1.setName("Sim");
//		s1.setMarks(95);

//		s2.setRollNo(102);
//		s2.setName("Navin");
//		s2.setMarks(75);
//
//		s3.setRollNo(103);
//		s3.setName("Shubham");
//		s3.setMarks(89);
//
//		repo.save(s1);
//		repo.save(s2);
//		repo.save(s3);

//		System.out.println(repo.findAll());
//		System.out.println(repo.count());
//		System.out.println(repo.findById(101));
//		System.out.println(repo.findByName("Shubham"));
//		System.out.println(repo.findByMarks(95));
//		System.out.println(repo.findByMarksGreaterThan(80));

		repo.save(s1);

	}

}
