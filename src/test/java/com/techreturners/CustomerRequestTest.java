package com.techreturners;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class CustomerRequestTest {

    @Test
    public void testAllocateTicketWhenCustomerRequestOneTicket(){
        Seat a1 = new Seat("A1",false);

        ArrayList<Seat> seats = new ArrayList<Seat>();
        seats.add(a1);
        Customer customer = new Customer();
        customer.name = "Customer1";
        String expected = "Customer1 has booked seats - A1 ";
        assertEquals(expected,customer.allocateTickets(1, seats, 0));
    }

    @Test
    public void testAllocateTwoTicketsWhenCustomerRequestTwoTickets(){
        Seat a1 = new Seat("A1",false);
        Seat a2 = new Seat("A2", false);

        ArrayList<Seat> seats = new ArrayList<Seat>();
        seats.add(a1);
        seats.add(a2);
        Customer customer = new Customer();
        customer.name = "Customer1";
        String expected = "Customer1 has booked seats - A1 A2 ";
       assertEquals(expected,customer.allocateTickets(2, seats, 0));
    }

    @Test
    public void testAllocateThreeTicketsWhenCustomerRequestThreeTickets(){
        Seat a1 = new Seat("A1",false);
        Seat a2 = new Seat("A2", false);
        Seat a3 = new Seat("A3", false);

        ArrayList<Seat> seats = new ArrayList<Seat>();
        seats.add(a1);
        seats.add(a2);
        seats.add(a3);
        Customer customer = new Customer();
        customer.name = "Customer1";
        String expected = "Customer1 has booked seats - A1 A2 A3 ";
        assertEquals(expected,customer.allocateTickets(3, seats, 0));
    }

    @Test
    public void GivenWhenTwoTicketsAreFilledCustomerRequestTwoTickets(){
        Seat a1 = new Seat("A1",true);
        Seat a2 = new Seat("A2", true);
        Seat a3 = new Seat("A3", false);
        Seat a4 = new Seat("A4", false);

        ArrayList<Seat> seats = new ArrayList<Seat>();
        seats.add(a1);
        seats.add(a2);
        seats.add(a3);
        seats.add(a4);

        Customer customer = new Customer();
        customer.name = "Customer1";
        String expected = "Customer1 has booked seats - A3 A4 ";
        assertEquals(expected,customer.allocateTickets(2, seats, 2));
    }


}
