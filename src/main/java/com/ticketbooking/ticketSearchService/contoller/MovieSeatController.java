package com.ticketbooking.ticketSearchService.contoller;

import com.ticketbooking.ticketSearchService.dto.ShowSeatsDTO;
import com.ticketbooking.ticketSearchService.entities.MovieSeatInfo;
import com.ticketbooking.ticketSearchService.service.MovieSeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seatInfo")
public class MovieSeatController {
    @Autowired
    private MovieSeatService movieSeatService;
    @PostMapping("/createSeats")
    ResponseEntity<List<MovieSeatInfo>> createSeats(@RequestBody ShowSeatsDTO showSeatsDTO){
        return ResponseEntity.status(HttpStatus.CREATED).body(movieSeatService.createSeats(showSeatsDTO));
    }

    @PostMapping("/changeStatus/{seatId}")
    ResponseEntity<String> changeStatus(@PathVariable String id, @RequestParam boolean available){
       return movieSeatService.changeStatus(id,available) ? ResponseEntity.ok("Success") :
               ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Failure");
    }
}
