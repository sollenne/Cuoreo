package com.mover.mover.vo;
 
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

public class CompanyVO implements Serializable{

    @NotBlank
    private String companyName;

    @NotBlank
    @Email
    private String emailAddress;

    @NotBlank
    private String phoneNumber;

    private String marketingDescription;

    private String nonOperationalDays;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMarketingDescription() {
        return marketingDescription;
    }

    public void setMarketingDescription(String marketingDescription) {
        this.marketingDescription = marketingDescription;
    }

    public String getNonOperationalDays() {
        return nonOperationalDays;
    }

    public void setNonOperationalDays(String nonOperationalDays) {
        this.nonOperationalDays = nonOperationalDays;
    }
}