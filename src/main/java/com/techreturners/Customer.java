package com.techreturners;

import java.util.ArrayList;

public class Customer {
    public String name;
    public String seatName;

    public int getRandomTickets(int Min, int Max) {
        return (int) (Math.random() * (Max - Min)) + Min;
    }

    public String allocateTickets(int tickets, ArrayList<Seat> seats, int checkpoint) {
        String message = this.name + " has booked seats - ";

        for (int i = checkpoint; i < checkpoint + tickets; i++) {
            seats.get(i).allocated = true;
            this.seatName = seats.get(i).seatName;
            message += this.seatName + " ";
        }
        return  message;

    }
}
