package com.tts.subscriberlist.subscriber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimeStamp;
import org.springframework.data.annotation.CreatedDate;


@Entity
public class Subscriber {

  //properties
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String userName;

    @Column 
    @CreationTimeStamp
    private Date signedUP;


    public Subscriber(){}


    public Subscriber(String firstName, String lastName, String userName, Date signedUP) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.signedUP = signedUP;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Date getSignedUP() {
        return this.signedUP;
    }

    public void setSignedUP(Date signedUP) {
        this.signedUP = signedUP;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + id + "'" +
            ", firstName='" + firstName + "'" +
            ", lastName='" + lastName + "'" +
            ", userName='" + userName + "'" +
            ", signedUP='" + signedUP + "'" +
            "}";
    }
    


}