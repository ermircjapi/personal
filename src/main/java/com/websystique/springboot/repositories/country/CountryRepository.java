package com.websystique.springboot.repositories.country;

import com.websystique.springboot.model.country.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ecjapi on 3/17/2017.
 */
@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    Country findByName(String name);
}
