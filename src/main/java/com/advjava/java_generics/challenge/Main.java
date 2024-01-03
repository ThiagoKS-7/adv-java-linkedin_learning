package com.advjava.java_generics.challenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

        List<String> destinations = flattenList(destinationLists);
        System.out.println(destinations);

        List<Ticket> tickets = flattenList(ticketLists);
        System.out.println(tickets);
    }

    // Maneira de usar wildcards sem method references (precisa usar wildcard na
    // lista tbm)
    static <T> List<T> flattenList(List<? extends List<? extends T>> nestedList) {
        List<T> flattenedList = new ArrayList<>();
        for (List<? extends T> innerList : nestedList) {
            flattenedList.addAll(innerList);
        }
        return flattenedList;
    }

}
