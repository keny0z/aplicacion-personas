package co.com.personas.apipersonas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class ApipersonasApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ApipersonasApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		 String password = "k3vm4";
		 for (int i = 0; i < 10; i++) {
			 BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();	 
			 String passwordEncrypt = passwordEncoder.encode(password);
			 System.out.println(passwordEncrypt); 
		}
		
	}

}
