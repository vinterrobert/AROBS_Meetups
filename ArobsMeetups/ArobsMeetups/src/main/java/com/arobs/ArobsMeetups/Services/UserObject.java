package com.arobs.ArobsMeetups.Services;

import com.arobs.ArobsMeetups.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserObject {

    @Autowired
    UserRepository userRepository;
}
