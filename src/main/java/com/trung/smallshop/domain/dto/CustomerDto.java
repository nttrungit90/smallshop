/*
 * Created on 24 Mar 2018 ( Time 12:24:10 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package com.trung.smallshop.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.*;


public class CustomerDto implements Serializable {

    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @NotNull
    private Integer id;

    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @NotNull
    @Size( min = 1, max = 40 )
    private String firstName;

    @NotNull
    @Size( min = 1, max = 40 )
    private String lastName;

    @Size( max = 40 )
    private String city;

    @Size( max = 40 )
    private String country;

    @Size( max = 20 )
    private String phone;



    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setId( Integer id ) {
        this.id = id ;
    }

    public Integer getId() {
        return this.id;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCity(String city ) {
        this.city = city;
    }
    public String getCity() {
        return this.city;
    }

    public void setCountry( String country ) {
        this.country = country;
    }
    public String getCountry() {
        return this.country;
    }

    public void setPhone( String phone ) {
        this.phone = phone;
    }
    public String getPhone() {
        return this.phone;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(firstName);
        sb.append("|");
        sb.append(lastName);
        sb.append("|");
        sb.append(city);
        sb.append("|");
        sb.append(country);
        sb.append("|");
        sb.append(phone);
        return sb.toString(); 
    } 


}