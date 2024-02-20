package com.ticketbooking.ticketSearchService.service;

import com.ticketbooking.ticketSearchService.dto.ShowSeatsDTO;
import com.ticketbooking.ticketSearchService.entities.MovieSeatInfo;

import java.util.List;

public interface MovieSeatService {
    List<MovieSeatInfo> createSeats(ShowSeatsDTO showSeatsDTO);

    boolean changeStatus(String id, boolean available);
}
