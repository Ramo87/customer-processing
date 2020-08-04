package com.leseanu.ramona.service;

import com.leseanu.ramona.domain.Client;

import java.util.List;

/**
 * Created by Loky on 02/08/2020.
 */
public interface ClientService {

    void printCustomersUnderAge30(List<Client> clientList);
    void printAllNamesStartingWith(String value, List<Client> clientList);

}
