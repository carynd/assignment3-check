package com.example.demo;

import com.example.demo.entity.passport;
import com.example.demo.service.passportservice;
import com.example.demo.service.studentservice;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class DemoApplication {


	@Autowired
	studentservice studentService;

	@Autowired
	passportservice passportService;

	//@Autowired
//	CourseService courseService;

	static final Logger log=
			LoggerFactory.getLogger(DemoApplication.class);


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}


	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		Student student = studentService.findById(20001L); // persistence context(student)
//		log.info("Student -> {}",student);
//		log.info("Passport -> {}",student.getPassport()); // persistence context()
//

//		Passport passport = passportService.findById(50001L); // persistence context(student)
		log.info("Student -> {}",passport);
		log.info("Passport -> {}", passport.getStudent()); // persistence context()


		// Get the course 80001
		// Add 2 reviews to it
		// Save it to the database




	}
}
