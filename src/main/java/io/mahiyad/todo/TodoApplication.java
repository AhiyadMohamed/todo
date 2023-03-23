package io.mahiyad.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

	public static void main(String[] args) {
		System.out.println("Log message");
		SpringApplication.run(TodoApplication.class, args);
	}

}
