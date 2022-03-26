
package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
    /*
	sample
	*/
	@GetMapping("/hello")
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}

}

//Need to have  java 1.8 or above
// need to have apace tomat
//need to haven maven
//micro services as small independent services managed by server called eureka server
// every micro service has to register with eureka server
// eureka server it should not register itself
//https://spring.io/blog/2015/07/14/microservices-with-spring
//https://spring.io/microservices
