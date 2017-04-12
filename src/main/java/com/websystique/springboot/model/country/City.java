package com.websystique.springboot.model.country;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ecjapi on 3/16/2017.
 */
@Entity
@Table(name="city")
public class City implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "District")
    private String district;

    @Column(name = "Population")
    private Integer population;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "CountryCode")
    private Country country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }
}
