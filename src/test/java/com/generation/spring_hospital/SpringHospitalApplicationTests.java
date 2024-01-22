package com.generation.spring_hospital;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringHospitalApplicationTests {

	@Autowired
	PatientRepository pRepo;

	@Autowired
	VisitRepository vRepo;

	@Test
	void contextLoads() 
	{
		pRepo.findAll();
		vRepo.findAll();
	}

}
