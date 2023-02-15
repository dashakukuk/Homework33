package com.msaggik.fourthlessontrainticketsgroup.model;

import com.msaggik.fourthlessontrainticketsgroup.model.RailwayTicket;

public class RailwayTicketGrandparents extends RailwayTicket  {
    private float ticketDiscountGrandparents;
    public RailwayTicketGrandparents() {
    }

    public RailwayTicketGrandparents(float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscountGrandparents = ticketDiscountGrandparents;
    }
    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscountGrandparents))/100;
    }
}
