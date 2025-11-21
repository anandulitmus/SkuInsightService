package com.sephora.sas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SkuAggregatorServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SkuAggregatorServiceApplication.class, args);
    }
}
