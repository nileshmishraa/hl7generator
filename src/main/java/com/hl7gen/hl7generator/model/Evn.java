package com.hl7gen.hl7generator.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Evn {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String triggerEvent;
    private LocalDateTime localDateTime;
    private LocalDateTime plannedEvent;
    private String eventReasonCode;
    private String operatorId;
    private String eventOccurred;
    private String eventFacility;

}
