package com.websystique.springboot.model.country;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
}
