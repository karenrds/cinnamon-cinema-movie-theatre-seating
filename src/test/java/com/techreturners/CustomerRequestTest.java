package com.techreturners;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class CustomerRequestTest {

    @Test
    public void testAllocateTickets(){
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


}
