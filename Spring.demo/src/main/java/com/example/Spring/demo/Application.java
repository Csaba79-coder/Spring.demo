package com.example.Spring.demo;

import com.example.Spring.demo.module.CopyRight;
import com.example.Spring.demo.util.Print;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {SpringApplication.run(Application.class, args);
		String copyRight = new CopyRight().addingCopyright();
		new Print().printString(copyRight);
		System.out.println("Hello first Spring.demo!");
	}

}
