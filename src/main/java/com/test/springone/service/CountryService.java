package com.test.springone.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.springone.beans.Country;
import com.test.springone.dao.CountryDao;

@Service
public class CountryService {

	@Autowired
	private CountryDao countryDao;

	public Country getCountryById(int id) {
		return countryDao.getCountries()
					.stream()
					.filter(c -> (c.getId() == id))
					.findFirst()
					.get();
	}

	public List<Country> createCountryList() {
		return countryDao.getCountries();
	}
}
