package com.advjava.java_generics.challenge.ticket_machine;

import java.util.ArrayList;
import java.util.List;

import com.advjava.java_generics.challenge.ticket_machine.tickets.Ticket;

public class TicketMachine {

    public static <T extends Ticket> List<T> flattenList(List<List<? extends Ticket>> list) {
        List<T> flattenedList = new ArrayList<>();

        for (List<? extends Ticket> sublist : list) {
            for (Ticket ticket : sublist) {
                flattenedList.add((T) ticket);
            }
        }

        return flattenedList;
    }

    public static int getTotalPrice(List<Ticket> tickets) {
        int totalPrice = 0;
        for (Ticket ticket : tickets) {
            totalPrice += ticket.getPrice();
        }
        return totalPrice;
    }

}