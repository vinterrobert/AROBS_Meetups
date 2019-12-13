package com.arobs.ArobsMeetups.Repositories;

import com.arobs.ArobsMeetups.Entities.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserRepository {

    User findUserById (int userId){

        return null;

    }

    User findUserByEmail (String email){

        return null;
    }

    void createUser(User newUser){

    }

    void updateUser(int userId, User updatedUser){

    }

    void deleteUser(int userId){

    }

    List<User> getAllUsers(){

        return null;

    }

}
