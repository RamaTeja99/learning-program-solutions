package com.cognizant.service;

import org.springframework.stereotype.Service;

import com.cognizant.model.Country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@Service
public class CountryService {

    private final ApplicationContext context;

    public CountryService() {
        this.context = new ClassPathXmlApplicationContext("country.xml");
    }

    public Country getCountry(String code) {
        List<Country> countries = (List<Country>) context.getBean("countryList");

        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElse(null);
    }
}
