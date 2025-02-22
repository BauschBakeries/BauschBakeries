package com.bauschbakeries.bauschbakeries_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.bauschbakeries.bauschbakeries_backend.models")
public class BauschBakeriesBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BauschBakeriesBackendApplication.class, args);
    }

}
