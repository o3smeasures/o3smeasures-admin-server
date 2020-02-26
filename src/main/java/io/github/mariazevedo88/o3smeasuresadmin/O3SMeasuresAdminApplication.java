package io.github.mariazevedo88.o3smeasuresadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class O3SMeasuresAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(O3SMeasuresAdminApplication.class, args);
	}

}
