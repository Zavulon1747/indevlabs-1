package com.damselbeing.indevlabs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IndevlabsApplication {

	public static void main(String[] args) {
		SpringApplication.run(IndevlabsApplication.class, args);

		Task task = new Task();
		int[] array = {3, 5, 6};
		task.findMissingNumber(array);
	}

}
