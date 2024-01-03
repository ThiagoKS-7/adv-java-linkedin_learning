package com.advjava.java_generics.challenge.ticket_machine.tickets;

public class ChildTicket extends Ticket {

    @Override
    public int getPrice() {
        return 5;
    }

    @Override
    public String toString() {
        return "Child ticket";
    }

}
