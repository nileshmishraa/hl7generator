package com.hl7gen.hl7generator.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Patient implements Serializable {

    @Id
    @Column(nullable = false)
    private Long id;
    private String name;
    private String motherName;
    private Date dob;
    private String sex;
    private String alias;
    private String phone;
    private String email;

    public Patient() {
    }

    public Patient(Long id, String name, String motherName, Date dob, String sex, String alias, String phone, String email) {
        this.id = id;
        this.name = name;
        this.motherName = motherName;
        this.dob = dob;
        this.sex = sex;
        this.alias = alias;
        this.phone = phone;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public Patient setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Patient setName(String name) {
        this.name = name;
        return this;
    }

    public String getMotherName() {
        return motherName;
    }

    public Patient setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public Date getDob() {
        return dob;
    }

    public Patient setDob(Date dob) {
        this.dob = dob;
        return this;
    }

    public String getSex() {
        return sex;
    }

    public Patient setSex(String sex) {
        this.sex = sex;
        return this;
    }

    public String getAlias() {
        return alias;
    }

    public Patient setAlias(String alias) {
        this.alias = alias;
        return this;
    }

    public String getPhone() {
        return phone;
    }

    public Patient setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public Patient setEmail(String email) {
        this.email = email;
        return this;
    }
}
