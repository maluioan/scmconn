package com.test.springone.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.springone.beans.Country;
import com.test.springone.service.CountryService;

@RestController
public class CountryController {

	private static final Logger logger = Logger.getLogger(CountryController.class);

	@Autowired
	private CountryService countryService;

	@RequestMapping(value = "/countries", method = RequestMethod.GET)
	public List<Country> getCountries() {
		logger.info("Enetering /countries -> getCountries()");
		return countryService.createCountryList();
	}

	@RequestMapping(value = "/country/{id}", method = RequestMethod.GET)
	public Country getCountryById(@PathVariable int id) {
		logger.debug("Enetering /country/{id} -> getCountryById()");
		return countryService.getCountryById(id);
	}

}
