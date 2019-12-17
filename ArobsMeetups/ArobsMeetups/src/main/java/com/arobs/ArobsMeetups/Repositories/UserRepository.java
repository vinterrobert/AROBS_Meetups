package com.arobs.ArobsMeetups.Repositories;

import com.arobs.ArobsMeetups.Config.HibernateUtil;
import com.arobs.ArobsMeetups.Entities.User;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    public User findUserById(int userId) {
        User user = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            user = (User) session.get(User.class, userId);
        }
        return user;
    }

    public User findUserByEmail(String email) {
        User foundUser = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            Query hql = session.createQuery("from User u where u.email = :email")
                    .setParameter("email", email);
            foundUser = (User)hql.getSingleResult();
        }
        return foundUser;



    }

    public void createUser(User newUser) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(newUser);
            session.getTransaction().commit();
        }
    }

    public void updateUser(int userId, User updatedUser) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            session.beginTransaction();
            User currentUser = (User)session.get(User.class, userId);

            currentUser.setFullName(updatedUser.getFullName());
            currentUser.setRole(updatedUser.getRole());
            currentUser.setEmail(updatedUser.getEmail());
            currentUser.setPassword(updatedUser.getPassword());
            currentUser.setPoints(updatedUser.getPoints());

            session.update(currentUser);
            session.getTransaction().commit();
        }


    }

    public void deleteUser(int userId) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {

            session.beginTransaction();
            User userToDelete = (User)session.get(User.class, userId);
            session.delete(userToDelete);
            session.getTransaction().commit();
        }

    }

    public List<User> getAllUsers() {
        List<User> users = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            users = session.createQuery("from User", User.class).list();
        }
        return users;
    }
}
