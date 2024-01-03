package com.advjava.java_generics.challenge.ticket_machine;

import java.util.ArrayList;
import java.util.List;

import com.advjava.java_generics.challenge.ticket_machine.tickets.Ticket;

public class TicketMachine {

    // Maneira de usar wildcards sem method references (precisa usar wildcard na
    // lista tbm)
    public static <T> List<T> flattenList(List<? extends List<? extends T>> nestedList) {
        List<T> flattenedList = new ArrayList<>();
        for (List<? extends T> innerList : nestedList) {
            flattenedList.addAll(innerList);
        }
        return flattenedList;
    }

    public static int getTotalPrice(List<? extends Ticket> tickets) {
        int totalPrice = 0;
        for (Ticket ticket : tickets) {
            totalPrice += ticket.getPrice();
        }
        return totalPrice;
    }

}