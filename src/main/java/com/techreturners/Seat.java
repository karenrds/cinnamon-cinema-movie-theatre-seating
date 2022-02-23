package com.techreturners;

import java.util.ArrayList;

public class Seat {
    protected String seatName;
    protected boolean allocated = false;

    public Seat(String seatName, boolean allocated) {
        this.seatName = seatName;
        this.allocated = allocated;
    }

    public static ArrayList<Seat> seatList() {
        int seatRow = 3;

        ArrayList<Seat> seats = new ArrayList<>(seatRow);

        for (int a = 1; a <= 5; a++) {
            seats.add(new Seat("A"+(a), false));
        }
        for (int b = 1; b <= 5; b++) {
            seats.add(new Seat("B"+(b), false));
        }
        for (int c = 1; c <= 5; c++) {
            seats.add(new Seat("C"+(c), false));
        }

        /*for (int i = 0; i < seats.size(); i++) {
                System.out.print(seats.get(i).seatName + " ");
        }
        System.out.println();
        */
        int counter=0;
        for(Seat p : seats)
        {
            System.out.print(p.seatName + " ");
            counter++;
            if(counter%5==0){
                System.out.println();
            }
        }

        return seats;
    }
}
