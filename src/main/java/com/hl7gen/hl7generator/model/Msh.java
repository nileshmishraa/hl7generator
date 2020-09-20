package com.hl7gen.hl7generator.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Msh {
    private String encodingCharacter;
    private String sendingApplication;
    private String sendingFacility;
    private String receivingApplication;
    private String receivingFacility;
    private LocalDateTime date;
    private String security;
    private String type;
    @Id
    private String messageControlId;
    private String processingId;

    public Msh() {
    }

    public Msh(String encodingCharacter, String sendingApplication, String sendingFacility, String receivingApplication, String receivingFacility, LocalDateTime date, String security, String type, String messageControlId, String processingId) {
        this.encodingCharacter = encodingCharacter;
        this.sendingApplication = sendingApplication;
        this.sendingFacility = sendingFacility;
        this.receivingApplication = receivingApplication;
        this.receivingFacility = receivingFacility;
        this.date = date;
        this.security = security;
        this.type = type;
        this.messageControlId = messageControlId;
        this.processingId = processingId;
    }

    public String getEncodingCharacter() {
        return encodingCharacter;
    }

    public Msh setEncodingCharacter(String encodingCharacter) {
        this.encodingCharacter = encodingCharacter;
        return this;
    }

    public String getSendingApplication() {
        return sendingApplication;
    }

    public Msh setSendingApplication(String sendingApplication) {
        this.sendingApplication = sendingApplication;
        return this;
    }

    public String getSendingFacility() {
        return sendingFacility;
    }

    public Msh setSendingFacility(String sendingFacility) {
        this.sendingFacility = sendingFacility;
        return this;
    }

    public String getReceivingApplication() {
        return receivingApplication;
    }

    public Msh setReceivingApplication(String receivingApplication) {
        this.receivingApplication = receivingApplication;
        return this;
    }

    public String getReceivingFacility() {
        return receivingFacility;
    }

    public Msh setReceivingFacility(String receivingFacility) {
        this.receivingFacility = receivingFacility;
        return this;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public Msh setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }

    public String getSecurity() {
        return security;
    }

    public Msh setSecurity(String security) {
        this.security = security;
        return this;
    }

    public String getType() {
        return type;
    }

    public Msh setType(String type) {
        this.type = type;
        return this;
    }

    public String getMessageControlId() {
        return messageControlId;
    }

    public Msh setMessageControlId(String messageControlId) {
        this.messageControlId = messageControlId;
        return this;
    }

    public String getProcessingId() {
        return processingId;
    }

    public Msh setProcessingId(String processingId) {
        this.processingId = processingId;
        return this;
    }
}
