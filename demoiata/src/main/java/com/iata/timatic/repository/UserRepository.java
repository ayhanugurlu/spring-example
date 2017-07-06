package com.iata.timatic.repository;

/**
 * Created by Ayhan Ugurlu - (ayhan.ugurlu@odc.com.tr) on 6.07.2017.
 */

import java.util.List;


import com.iata.timatic.repository.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

    User findByUsernameAndPassword(String userName, String password);

}