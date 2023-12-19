package com.hello.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class HelloMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloMicroserviceApplication.class, args);
	}

	@Autowired
	private Environment environment;

	@GetMapping("/hello")
	public String getHello(){
		return "hello: "+environment.getProperty("local.server.port");
	}

}
