package com.scm.SmartContactsManager.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.scm.SmartContactsManager.Entitys.User;

@Repository
public interface userRepo extends JpaRepository<User, Integer> {

}
