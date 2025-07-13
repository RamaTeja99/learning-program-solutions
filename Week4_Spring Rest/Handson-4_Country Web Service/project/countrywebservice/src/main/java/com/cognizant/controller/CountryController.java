package com.cognizant.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.cognizant.model.Country;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    private final ApplicationContext context;

    public CountryController() {
        context = new ClassPathXmlApplicationContext("country.xml");
    }

    @RequestMapping("/country")
    public Country getCountryIndia() {
        LOGGER.info("START - getCountryIndia");
        Country country = context.getBean("in", Country.class);
        LOGGER.info("END - getCountryIndia");
        return country;
    }

    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        LOGGER.info("START - getAllCountries");
        List<Country> countries = (List<Country>) context.getBean("countryList");
        LOGGER.info("END - getAllCountries");
        return countries;
    }
}
