package com.codeclan.example.pirateservice;

import com.codeclan.example.pirateservice.models.Pirate;
import com.codeclan.example.pirateservice.repositories.PirateRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PirateserviceApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private PirateRepository pirateRepository;

	@Test
	public void canCreateAndSaveAPirate(){
		Pirate pirate = new Pirate("Jack", "Sparrow", 30);
		pirateRepository.save(pirate);
	}
}
