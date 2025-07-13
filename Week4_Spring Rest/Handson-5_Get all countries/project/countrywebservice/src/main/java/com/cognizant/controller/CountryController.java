package com.cognizant.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import com.cognizant.model.Country;
import com.cognizant.service.CountryService;


@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("START - getCountry");
        Country country = countryService.getCountry(code);
        LOGGER.info("END - getCountry");
        return country;
    }
}

