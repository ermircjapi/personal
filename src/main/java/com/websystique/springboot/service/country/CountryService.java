package com.websystique.springboot.service.country;

import com.websystique.springboot.model.country.Country;

import java.util.List;

public interface CountryService {
	
	Country findById(String id);

	Country findByName(String name);

	void saveCountry(Country country);

	void updateCountry(Country country);

	void deleteCountryById(String id);

	void deleteAllCountries();

	List<Country> findAllCountries();

	boolean isCountryExist(Country country);
}