package com.ticketbooking.ticketSearchService.repositores;

import com.ticketbooking.ticketSearchService.entities.MovieSeatInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieSeatRepository extends JpaRepository<MovieSeatInfo,String> {
}
