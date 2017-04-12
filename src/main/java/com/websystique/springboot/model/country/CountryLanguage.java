package com.websystique.springboot.model.country;

import com.websystique.springboot.model.country.enums.Official;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by ecjapi on 3/16/2017.
 */
@Entity
@Table(name="countrylanguage")
public class CountryLanguage implements Serializable{

    @EmbeddedId
    private CountryLanguagePK countryLanguagePK;

    @Enumerated(EnumType.STRING)
    private Official isOfficial;

    @Column(name = "Percentage")
    private Double percentage;

    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn(name = "CountryCode")
    private Country country;

    public Official getIsOfficial() {
        return isOfficial;
    }

    public void setIsOfficial(Official isOfficial) {
        this.isOfficial = isOfficial;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Embeddable
    public static class CountryLanguagePK implements Serializable {
        private String countryCode;
        private String language;

        public CountryLanguagePK() {}

        public CountryLanguagePK(String countryCode, String language) {
            this.countryCode = countryCode;
            this.language = language;
        }

        public String getCountryCode() {
            return countryCode;
        }

        public void setCountryCode(String countryCode) {
            this.countryCode = countryCode;
        }

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }
    }
}
