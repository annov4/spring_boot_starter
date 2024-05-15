package com.example.spring_boot_starter.config;

import com.example.spring_boot_starter.client.IncomeClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    public IncomeClient incomeClient(RestTemplate restTemplate) {
        return new IncomeClient(restTemplate);
    }
}
