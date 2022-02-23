package com.techreturners;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Seat> seats;
        seats = Seat.seatList();

        int checkpoint = 0;
        int number = 1;
        while (checkpoint < 15) {
            Customer customer = new Customer();
            int tickets = customer.getRandomTickets(1, 4);
            if (tickets <= seats.size() - checkpoint) {
                customer.name = "Customer" + String.valueOf(number++);
                String message = customer.allocateTickets(tickets, seats, checkpoint);
                System.out.println(message);
                checkpoint = checkpoint + tickets;
            } else {
                System.out.println(tickets + " tickets not available");
            }

        }
    }

}
