package net.javatatiana.springboot;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import net.javatatiana.springboot.entity.Gender;
import net.javatatiana.springboot.entity.User;
import net.javatatiana.springboot.entity.UserProfile;
import net.javatatiana.springboot.repository.UserProfileRepository;
import net.javatatiana.springboot.repository.UserRepository;

@SpringBootApplication
public class SpringbootHibernateOneToOneMappingApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneToOneMappingApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		// user object
		User user = new User();
		user.setName("Tatiana");
		user.setEmail("tatianatsslow@gmail.com");
		
		UserProfile userProfile = new UserProfile();
		userProfile.setAddress("Pune");
		userProfile.setBirthOfDate(LocalDate.of(1991, 03, 24));
		userProfile.setGender(Gender.FEMALE);
		userProfile.setPhoneNumber("1234567899");
		
		user.setUserProfile(userProfile);
		userProfile.setUser(user);
		
		userRepository.save(user);
	}

}
