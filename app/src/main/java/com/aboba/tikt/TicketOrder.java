package com.aboba.tikt;

import java.io.Serializable;

public class TicketOrder implements Serializable{
    private int userId;
    private String depPlace, arrivalPlace;
    private int depHour, depMinute;
    private int arrivalHour, arrivalMinute;
    private int ticketCost;

    public TicketOrder(int userId, String depPlace, int depHour, int depMinute, String arrivalPlace,
                       int arrivalHour, int arrivalMinute, int ticketCost){
        this.userId=userId;
        this.depPlace=depPlace;
        this.depHour=depHour;
        this.depMinute=depMinute;
        this.arrivalPlace=arrivalPlace;
        this.arrivalHour=arrivalHour;
        this.arrivalMinute=arrivalMinute;
        this.ticketCost=ticketCost;
    }
    public TicketOrder(){}

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserId() {
        return userId;
    }

    public void setDepPlace(String depPlace) {
        this.depPlace = depPlace;
    }

    public String getDepPlace() {
        return depPlace;
    }

    public void setDepHour(int depHour) {
        this.depHour = depHour;
    }

    public int getDepHour() {
        return depHour;
    }

    public void setDepMinute(int depMinute) {
        this.depMinute = depMinute;
    }

    public int getDepMinute() {
        return depMinute;
    }

    public void setArrivalPlace(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    public void setArrivalHour(int arrivalHour) {
        this.arrivalHour = arrivalHour;
    }

    public int getArrivalHour() {
        return arrivalHour;
    }

    public void setArrivalMinute(int arrivalMinutes) {
        this.arrivalMinute = arrivalMinutes;
    }

    public int getArrivalMinute() {
        return arrivalMinute;
    }

    public void setTicketCost(int ticketCost) {
        this.ticketCost = ticketCost;
    }

    public int getTicketCost() {
        return ticketCost;
    }
}
