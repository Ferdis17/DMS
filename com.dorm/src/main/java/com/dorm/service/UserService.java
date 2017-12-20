package com.dorm.service;

import com.dorm.domain.User;

public interface UserService {
	
	void save(User user);

    User findUserByEmail(String email);

    void updateUser(User user);

    User findOne(Long userId);
}


