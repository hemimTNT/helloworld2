package com.example.demo.model;

import javax.persistence.*;

@Table(name = "girl_info")
public class GirlInfo {
    @Id
    @Column(name = "girl_name")
    private String girlName;

    @Column(name = "girl_age")
    private Integer girlAge;

    /**
     * @return girl_name
     */
    public String getGirlName() {
        return girlName;
    }

    /**
     * @param girlName
     */
    public void setGirlName(String girlName) {
        this.girlName = girlName;
    }

    /**
     * @return girl_age
     */
    public Integer getGirlAge() {
        return girlAge;
    }

    /**
     * @param girlAge
     */
    public void setGirlAge(Integer girlAge) {
        this.girlAge = girlAge;
    }
}