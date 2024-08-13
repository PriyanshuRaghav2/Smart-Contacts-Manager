package com.scm.SmartContactsManager.ServicesImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scm.SmartContactsManager.Entitys.User;
import com.scm.SmartContactsManager.Exceptions.UserNotFoundException;
import com.scm.SmartContactsManager.Repository.userRepo;
import com.scm.SmartContactsManager.Services.userService;

@Service
public class userServiceImpl implements userService {

	@Autowired
	private userRepo repo;
	
	@Override
	public void saveNewUser(User user) {
		repo.save(user);
	}

	@Override
	
	public void deleteUserById(Integer Id) {
		User user1=repo.findById(Id).orElseThrow(()-> new UserNotFoundException("User Not Found"));
		repo.delete(user1);
	}

	@Override
	public void updateUser(User user) {
		User user1=repo.findById(user.getId()).orElseThrow(()-> new UserNotFoundException("User Not Found"));
		user1.setName(user.getName());
		user1.setUserName(user.getUserName());
		user1.setEmail(user.getEmail());;
		user1.setPhoneNo(user.getPhoneNo());;
		user1.setPassword(user.getPassword());
		user1.setEmailVerified(user.isEmailVerified());
		
		repo.save(user1);
		
	}

	@Override
	public List<User> getAllUser() {
		return repo.findAll();
	}

}
