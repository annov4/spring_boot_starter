package com.example.spring_boot_starter.client;

import com.example.spring_boot_starter.model.Income;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
@RequiredArgsConstructor
public class IncomeClient {

    private final RestTemplate restTemplate;

    @Value("${income.api.url}")
    private String incomeApiUrl;

    public Income getIncomeForUser(Long userId) {
        Income[] incomes = restTemplate.getForObject(incomeApiUrl, Income[].class);
        if (incomes != null) {
            for (Income income : incomes) {
                if (income.getUserId() == userId) {
                    return income;
                }
            }
        }
        return new Income(userId, 0);

    }
}
