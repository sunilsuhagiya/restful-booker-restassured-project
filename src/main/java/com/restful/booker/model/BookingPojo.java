package com.restful.booker.model;


import java.util.HashMap;

public class BookingPojo {

    private String firstName;
    private String lastName;
    private double totalPrice;
    private boolean depositPaid;
    private HashMap<Object, Object> bookingDates;
    private String additionalNeeds;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public boolean isDepositPaid() {
        return depositPaid;
    }

    public void setDepositPaid(boolean depositPaid) {
        this.depositPaid = depositPaid;
    }

    public HashMap<Object, Object> getBookingDates() {
        return bookingDates;
    }

    public void setBookingDates(HashMap<Object, Object> bookingDates) {
        this.bookingDates = bookingDates;
    }

    public String getAdditionalNeeds() {
        return additionalNeeds;
    }

    public void setAdditionalNeeds(String additionalNeeds) {
        this.additionalNeeds = additionalNeeds;
    }
}

