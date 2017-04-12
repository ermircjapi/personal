package com.websystique.springboot.repositories.country;

import com.websystique.springboot.model.country.CountryLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by ecjapi on 3/17/2017.
 */
@Repository
public interface CountryLanguageRepository extends JpaRepository<CountryLanguage, CountryLanguage.CountryLanguagePK>{
}
