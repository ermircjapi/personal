package com.websystique.springboot.service.country;

import com.websystique.springboot.model.country.Country;
import com.websystique.springboot.repositories.country.CountryRepository;
import org.springframework.beans.InvalidPropertyException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service("countryService")
@Transactional(rollbackFor = Throwable.class, readOnly = true)
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	public Country findById(String id) {
		return countryRepository.findOne(id);
	}

	public Country findByName(String name) {
		return countryRepository.findByName(name);
	}

	@Transactional
	public void saveCountry(Country country) {
		countryRepository.save(country);
	}

	@Transactional
	public void updateCountry(Country country){
		saveCountry(country);
	}

	@Transactional
	public void deleteCountryById(String id){
		Country country = countryRepository.findOne(id);
		if(country != null) {
			countryRepository.delete(country);
		} else {
			throw new InvalidPropertyException(Country.class, "id", "Object not found");
		}
	}

	@Transactional
	public void deleteAllCountries(){
		countryRepository.deleteAll();
	}

	public List<Country> findAllCountries(){
		return countryRepository.findAll();
	}

	public boolean isCountryExist(Country country) {
		return findByName(country.getCode()) != null;
	}
}
