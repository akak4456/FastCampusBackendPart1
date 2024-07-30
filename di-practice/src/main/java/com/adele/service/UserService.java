package com.adele.service;

import com.adele.annotation.Inject;
import com.adele.annotation.Service;
import com.adele.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Inject
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }
}
