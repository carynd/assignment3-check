package com.masai.books.BookManagement;

import com.masai.books.BookManagement.entity.Course;
import com.masai.books.BookManagement.entity.Passport;
import com.masai.books.BookManagement.entity.Review;
import com.masai.books.BookManagement.entity.Student;
import com.masai.books.BookManagement.service.CourseService;
import com.masai.books.BookManagement.service.PassportService;
import com.masai.books.BookManagement.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class BookManagementApplication  implements CommandLineRunner{

	@Autowired
	StudentService studentService;

	@Autowired
	PassportService passportService;

	@Autowired
	CourseService courseService;

	static final Logger log=
			LoggerFactory.getLogger(BookManagementApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookManagementApplication.class, args);
	}


	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		Student student = studentService.findById(20001L); // persistence context(student)
//		log.info("Student -> {}",student);
//		log.info("Passport -> {}",student.getPassport()); // persistence context()
//

//		Passport passport = passportService.findById(50001L); // persistence context(student)
//		log.info("Student -> {}",passport);
//		log.info("Passport -> {}",passport.getStudent()); // persistence context()


		// Get the course 80001
		// Add 2 reviews to it
		// Save it to the database


//		log.info("Course -> {}", course.getReviews());

		List<Review> reviews = new ArrayList<>();
		reviews.add(new Review("Brilliant"));
		reviews.add(new Review("Bad"));

		courseService.addReviews(8001L,reviews);



	}

}
