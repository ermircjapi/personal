package com.websystique.springboot.model.country;

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
}
