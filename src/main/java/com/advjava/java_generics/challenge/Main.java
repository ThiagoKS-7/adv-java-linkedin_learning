package com.advjava.java_generics.challenge;

import java.util.Arrays;
import java.util.List;

import com.advjava.java_generics.challenge.ticket_machine.TicketMachine;
import com.advjava.java_generics.challenge.ticket_machine.tickets.AdultTicket;
import com.advjava.java_generics.challenge.ticket_machine.tickets.ChildTicket;
import com.advjava.java_generics.challenge.ticket_machine.tickets.Ticket;

public class Main {
    public static void main(String[] args) {
        List<List<String>> destinationLists = Arrays.asList(
                Arrays.asList("New York", "Boston"),
                Arrays.asList("Los Angeles", "San Francisco"));

        List<List<? extends Ticket>> ticketLists = Arrays.asList(
                Arrays.asList(new AdultTicket(), new AdultTicket()),
                Arrays.asList(new ChildTicket(), new ChildTicket()));

        List<String> destinations = TicketMachine.flattenList(destinationLists);
        System.out.println(destinations);

        List<Ticket> tickets = TicketMachine.flattenList(ticketLists);
        System.out.println(tickets);

        System.out.println("Total price: " + TicketMachine.getTotalPrice(tickets));

        List<AdultTicket> adultTickets = Arrays.asList(new AdultTicket(), new AdultTicket());
        System.out.println("Total price: " + TicketMachine.getTotalPrice(adultTickets));

    }

}
