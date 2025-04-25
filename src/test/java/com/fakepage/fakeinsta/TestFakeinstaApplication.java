package com.fakepage.fakeinsta;

import org.springframework.boot.SpringApplication;

public class TestFakeinstaApplication {

	public static void main(String[] args) {
		SpringApplication.from(FakeinstaApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
