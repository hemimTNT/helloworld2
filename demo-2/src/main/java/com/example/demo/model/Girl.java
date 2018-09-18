package com.example.demo.model;

import javax.persistence.*;

public class Girl {
    @Id
    private Integer id;

    private Integer age;

    @Column(name = "girl_name")
    private String girlName;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @param age
     */
    public void setAge(Integer age) {
        this.age = age;
    }

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
}