package com.leseanu.ramona.service;

import com.leseanu.ramona.domain.Client;

import java.util.List;

/**
 * Created by Loky on 02/08/2020.
 */
public class ClientServiceImpl implements ClientService{

    @Override
    public void printCustomersUnderAge30(List<Client> clientList){
        for(Client client : clientList ) {
            if(client.getAge() < 30) {
                System.out.println("Age = " + client.getAge());
            }
        }
    }

    @Override
    public void printAllNamesStartingWith(String value, List<Client> clientList){
        System.out.println("All the clients starting with: " + value);
        for(int i = 0; i<clientList.size(); i++){
            Client client = clientList.get( i );
            String clientName = client.getName();
            String lowerCaseClientName = clientName.toLowerCase();
            if(lowerCaseClientName.startsWith( value.toLowerCase() )){
                System.out.println("Name: " + clientName);
            }
        }
    }

}
