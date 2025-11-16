package com.webserviceGM.demo.repositories;

import com.webserviceGM.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

}
