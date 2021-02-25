package com.github.microprograms.spring_boot_admin_server_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdminServerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAdminServerDemoApplication.class, args);
	}

}
