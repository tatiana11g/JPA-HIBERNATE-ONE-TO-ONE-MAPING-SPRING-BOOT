package net.javatatiana.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javatatiana.springboot.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>  { 


}
