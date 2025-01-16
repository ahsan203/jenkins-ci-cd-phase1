package com.ahsan.Srping_Jenkins_Phase1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SrpingJenkinsPhase1Application {


	@GetMapping("/greetings/{name}")
	public String greetings(@PathVariable String name)
	{
		//name.split(" ",)[0];

		name = name.split(" ")[0];
		return "Hello " + name + " This is the Demo of using Jenkins for CI/CD with Configuration-Approach."
	}

	public static void main(String[] args) {
		SpringApplication.run(SrpingJenkinsPhase1Application.class, args);
	}

}
