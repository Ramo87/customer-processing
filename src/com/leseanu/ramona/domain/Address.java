package com.leseanu.ramona.domain;

/**
 * Created by Loky on 01/08/2020.
 */
public class Address {

    private String city;
    private String postalCode;
    private String street;
    private String houseNumber;


    public Address(String city, String postalCode, String street, String houseNumber){
        this.city = city;
        this.postalCode = postalCode;
        this.street = street;
        this.houseNumber =houseNumber;

    }

    public void setCity( String city){
        this.city  = city;
    }

    public String getCity(){
        return this.city;
    }

    public void setPostalCode(String postalCode){
        this.postalCode = postalCode;
    }

    public String getPostalCode(){
        return this.postalCode;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet(){
        return this.street;
    }

    public void setHouseNumber(String houseNumber){
        this.houseNumber = houseNumber;
    }

    public String getHouseNumber(){
        return houseNumber;
    }
}
