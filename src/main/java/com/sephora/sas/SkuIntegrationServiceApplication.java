package com.sephora.sas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SkuIntegrationServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkuIntegrationServiceApplication.class, args);
    }
}
