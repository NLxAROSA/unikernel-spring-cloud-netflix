package io.bymbl.service.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Author: lars
 * Since: 17-11-15.
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistrationServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistrationServiceApp.class, args);
    }
}
