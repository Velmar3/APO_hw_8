package ru.geekbrains.lesson8.models;

import java.util.Date;

public class ChangeReservation extends Reservation {

    public ChangeReservation(int oldReservation, Date reservationDate, Table table, String name) {
        super(table, reservationDate, name);
    }

    public int getId() {
        return id;
    }

    private static int counter = 1000;
    private final int id;
    private int oldReservation;

    private Table table;
    private Date reservationDate;
    private String name;

    {
        id = ++counter;
    }

}
