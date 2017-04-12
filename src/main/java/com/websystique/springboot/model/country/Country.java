package com.websystique.springboot.model.country;

import com.websystique.springboot.model.country.enums.Continent;
import com.websystique.springboot.model.country.enums.Official;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ecjapi on 3/16/2017.
 */
@Entity
@Table(name="country")
public class Country implements Serializable {

    @Id
    private String code;

    @Column(name = "Name")
    private String name;

    @Enumerated(EnumType.STRING)
    private Continent continent;

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

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
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
}
