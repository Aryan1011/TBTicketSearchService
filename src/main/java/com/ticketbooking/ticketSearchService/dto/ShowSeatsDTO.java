package com.ticketbooking.ticketSearchService.dto;

public class ShowSeatsDTO {
    private String showId;
    private int seats;

    public ShowSeatsDTO(String showId, int seats) {
        this.showId = showId;
        this.seats = seats;
    }

    public ShowSeatsDTO() {
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
