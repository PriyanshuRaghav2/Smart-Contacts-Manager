package com.scm.SmartContactsManager.Services;

import java.util.List;

import com.scm.SmartContactsManager.Entitys.User;


public interface userService {
	
	public void saveNewUser(User user);
	public void deleteUserById(Integer Id);
	public void updateUser(User user);
	public List<User> getAllUser();
}
