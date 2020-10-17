package com.api.SportyShoes.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.SportyShoes.model.User;
import com.SportyShoes.repository.UserRepository;
import com.SportyShoes.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userrepository;

	@Override
	public User createUser(User user) {

		return userrepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {

		return userrepository.findAll();
	}

	@Override
	public void deleteByUserId(int userId) {
		
		 userrepository.deleteByUserId(userId);
		
	}

	@Override
	public User findByUserId(int userId) {
		
		return userrepository.findByUserId(userId);
	}
	
	
	@Override
	public User updateUser(User user) {
		
		return userrepository.save(user);
	}


}