package io.github.mariazevedo88.o3smeasuresadminserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@EnableAdminServer
@SpringBootApplication
public class O3SMeasuresAdminServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(O3SMeasuresAdminServerApplication.class, args);
	}

}
