package com.leseanu.ramona.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Loky on 01/08/2020.
 */
public class Company {
    private String name;
    private List<Client> clients;
    private Address address;

    public Company(String name, Address address){
        this.name = name;
        this.clients = new ArrayList<>();
        this.address = address;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
            }

    public List<Client> getClients(){
        return this.clients;
    }

    public void setAdress(Address adress){
        this.address = adress;
    }

    public Address getAdress(){
        return this.address;
    }

}
