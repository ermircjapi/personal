package com.websystique.springboot.model.country;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by ecjapi on 3/16/2017.
 */
@Entity
@Table(name="country")
public class Country implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String code;

    @Column(name = "Name")
    private String name;

    @Column(name="Continent", columnDefinition="enum('Asia','Europe','North America','Africa', " +
            "'Oceania','South America','Antarctica')")
    private String continent;

    @Column(name = "Region")
    private String region;

    @Column(name = "IndepYear")
    private Integer indepYear;

    @Column(name = "Population")
    private Integer population;

    @Column(name = "SurfaceArea")
    private Double surfaceArea;

    @Column(name = "GNP")
    private Double gnp;

    @Column(name = "LocalName")
    private String localName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="country", fetch=FetchType.EAGER)
    @JsonBackReference
    private Set<City> cities;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="country", fetch=FetchType.EAGER)
    @JsonBackReference
    private Set<CountryLanguage> countryLanguages;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getIndepYear() {
        return indepYear;
    }

    public void setIndepYear(Integer indepYear) {
        this.indepYear = indepYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Double getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(Double surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Double getGnp() {
        return gnp;
    }

    public void setGnp(Double gnp) {
        this.gnp = gnp;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public Set<City> getCities() {
        return cities;
    }

    public void setCities(Set<City> cities) {
        this.cities = cities;
    }

    public Set<CountryLanguage> getCountryLanguages() {
        return countryLanguages;
    }

    public void setCountryLanguages(Set<CountryLanguage> countryLanguages) {
        this.countryLanguages = countryLanguages;
    }
}
