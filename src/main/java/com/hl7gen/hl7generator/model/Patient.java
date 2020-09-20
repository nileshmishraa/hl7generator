package com.hl7gen.hl7generator.model;

import com.sun.istack.Nullable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.UniqueConstraint;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Patient implements Serializable {

    @Id
    @Column(nullable = false)
    private Long id;
    private String alternateId;
    private String name;
    private String motherMaidenName;
    private LocalDateTime dob;
    private String sex;
    private String alias;
    private String race;
    private String address;
    private String countryCode;
    private Long phoneHome;
    private Long phoneBusiness;
    private String primaryLang;
    private String maritalStatus;
    private String religion;
    private String patientAccountNo;
    @Column(nullable = false, updatable = false)
    private Long ssn;
    private String email;
    private String driverLicenseNo;
    private String motherIdentifier;
    private String ethnicGroup;
    private String birthPlace;
    private String multipleBirthIndicator;
    private String birthOrder;
    private String citizenship;
    private String veteranMilitaryStatus;
    private String nationality;
    private LocalDateTime deathTime;
    private String patientDeathIndicator;


}
