package com.ticketbooking.ticketSearchService.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MovieSeatInfo {
    @Id
    private String seatId;
    private String showId;
    private Boolean isAvailable;

    public MovieSeatInfo() {
    }

    public MovieSeatInfo(String seatId, String showId, Boolean available) {
        this.seatId = seatId;
        this.showId = showId;
        this.isAvailable = available;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        this.isAvailable = available;
    }
}
