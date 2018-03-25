/*
 * Created on 24 Mar 2018 ( Time 12:24:11 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
package com.trung.smallshop.domain.dto;

import java.io.Serializable;

import javax.validation.constraints.*;


public class SupplierDto implements Serializable {

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
    private String companyName;

    @Size( max = 50 )
    private String contactName;

    @Size( max = 40 )
    private String contactTitle;

    @Size( max = 40 )
    private String city;

    @Size( max = 40 )
    private String country;

    @Size( max = 30 )
    private String phone;

    @Size( max = 30 )
    private String fax;



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


    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
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

    public void setFax( String fax ) {
        this.fax = fax;
    }
    public String getFax() {
        return this.fax;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
 
        public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append(id);
        sb.append("|");
        sb.append(companyName);
        sb.append("|");
        sb.append(contactName);
        sb.append("|");
        sb.append(contactTitle);
        sb.append("|");
        sb.append(city);
        sb.append("|");
        sb.append(country);
        sb.append("|");
        sb.append(phone);
        sb.append("|");
        sb.append(fax);
        return sb.toString(); 
    } 


}
