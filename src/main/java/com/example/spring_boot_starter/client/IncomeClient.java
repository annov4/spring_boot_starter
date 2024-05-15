package com.example.spring_boot_starter.client;

import com.example.spring_boot_starter.model.Income;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class IncomeClient {

    private final RestTemplate restTemplate;

    @Autowired
    public IncomeClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Income getIncomeForUser(Long userId) {
        String url = "https://66055cd12ca9478ea1801f2e.mockapi.io/api/users/income";
        Income[] incomes = restTemplate.getForObject(url, Income[].class);
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
