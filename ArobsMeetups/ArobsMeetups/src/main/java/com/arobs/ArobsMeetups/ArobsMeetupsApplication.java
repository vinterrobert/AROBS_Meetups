package com.arobs.ArobsMeetups;

import com.arobs.ArobsMeetups.Config.HibernateUtil;
import com.arobs.ArobsMeetups.Entities.User;
import com.arobs.ArobsMeetups.Repositories.UserRepository;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ArobsMeetupsApplication {

	public static void main(String[] args) {

		UserRepository userRepository = new UserRepository();
		User user = new User ("Pop Ioan", "admin", "pop.ioan@gmail.com", "1234", 0);
		User updatedUser = new User ("Pop Ioan", "admin", "pop.ioan@gmail.com", "12345678910", 0);
		//userRepository.createUser(user);
		User foundUser = userRepository.findUserByEmail("pop.ioan@gmail.com");
		System.out.println(foundUser.getFullName());


//		SpringApplication.run(ArobsMeetupsApplication.class, args);
	}

}
