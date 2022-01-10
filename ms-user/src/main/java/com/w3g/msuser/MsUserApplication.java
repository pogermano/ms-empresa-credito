package com.w3g.msuser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableEurekaClient
@SpringBootApplication
public class MsUserApplication implements CommandLineRunner{
	
	@Autowired
	BCryptPasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(MsUserApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//System.out.println("BCRYPT = "+ passwordEncoder.encode("12356"));
		
	}

}
