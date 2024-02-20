package com.ticketbooking.ticketSearchService.service.impl;

import com.ticketbooking.ticketSearchService.dto.ShowSeatsDTO;
import com.ticketbooking.ticketSearchService.entities.MovieSeatInfo;
import com.ticketbooking.ticketSearchService.repositores.MovieSeatRepository;
import com.ticketbooking.ticketSearchService.service.MovieSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class MovieSeatServiceImpl implements MovieSeatService {
    @Autowired
    private MovieSeatRepository movieSeatRepository;
    @Override
    @Transactional
    public List<MovieSeatInfo> createSeats(ShowSeatsDTO showSeatsDTO) {
        List<MovieSeatInfo> movieSeatInfoList = new ArrayList<>();
        for (int i=0;i< showSeatsDTO.getSeats();i++){
            movieSeatInfoList.add(new MovieSeatInfo(UUID.randomUUID().toString(), showSeatsDTO.getShowId(), true));
        }
        return movieSeatRepository.saveAll(movieSeatInfoList);
    }

    @Override
    public boolean changeStatus(String id, boolean available) {
        MovieSeatInfo movieSeatInfo = movieSeatRepository.findById(id).orElse(null);
        if(movieSeatInfo!=null){
            movieSeatInfo.setAvailable(available);
            movieSeatRepository.save(movieSeatInfo);
            return true;
        }
        return false;
    }
}
