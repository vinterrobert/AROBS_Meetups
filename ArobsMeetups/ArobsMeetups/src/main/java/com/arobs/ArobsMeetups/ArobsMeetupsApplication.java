package com.arobs.ArobsMeetups;

import com.arobs.ArobsMeetups.Config.HibernateUtil;
import com.arobs.ArobsMeetups.Entities.User;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class ArobsMeetupsApplication {

	public static void main(String[] args) {

		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {

			List<User> users = session.createQuery("from User", User.class).list();
			for(User u :users){
				System.out.println(u.getFullName());

			}
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}


//		SpringApplication.run(ArobsMeetupsApplication.class, args);
	}

}
