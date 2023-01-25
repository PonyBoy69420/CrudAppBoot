package com.PonyBoy.CrudAppBoot.dao;

import com.PonyBoy.CrudAppBoot.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDAO extends JpaRepository<User,Long> {

}
