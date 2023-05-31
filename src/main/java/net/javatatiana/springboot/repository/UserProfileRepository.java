package net.javatatiana.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javatatiana.springboot.entity.UserProfile;


@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Long>  { 


}
