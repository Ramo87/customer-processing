package com.leseanu.ramona;

import java.util.*;

import com.leseanu.ramona.domain.Address;
import com.leseanu.ramona.domain.Client;
import com.leseanu.ramona.domain.Company;
import com.leseanu.ramona.service.*;
import com.leseanu.ramona.service.CompanyServiceImpl;

public class Main {

    public static void main(String[] args) {

        Address addressDeliPuiu = new Address( "Köln", "5+965a", "AachenerStr", "1370" );
        Address addressRudyAly = new Address( "Nürnberg", "5dfda", "CrazyStreet", "565" );
        Address addressLokyL = new Address( "Madrid", "557575", "SpainStreet", "176" );
        Address addressMyNextDog = new Address( "Alp" +
                "" +
                "" +
                "iMountain", "5Alp5", "MountainStreet", "89879" );
        Address addressMyNextLabrador = new Address( "AlpiMountain", "5Alp5", "MountainStreet", "89869" );


        Client one = new Client(  "DeliPuiu", 42, addressDeliPuiu  );
        Client two = new Client( "RudyAly", 33,addressRudyAly );
        Client three = new Client("LokyL", 25, addressLokyL);
        Client four = new Client("MyNextDog", 56, addressMyNextDog);
        Client five = new Client("MyNextLabrador", 29, addressMyNextLabrador);

        Address companyAddress = new Address( "Amsterdam", "123456", "RedLightStreet", "012" );

        Company bank = new Company( "ThePoorBank", companyAddress );

        List<Client> myBanksClients = bank.getClients();
        myBanksClients.add( one );
        myBanksClients.add( two );
        myBanksClients.add( three );
        myBanksClients.add( four );
        myBanksClients.add( five );

        ClientService clientService = new ClientServiceImpl();
        clientService.printCustomersUnderAge30( bank.getClients() );

        clientService.printAllNamesStartingWith( "m", myBanksClients);
    }
}
