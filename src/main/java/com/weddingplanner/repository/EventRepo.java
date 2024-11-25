package com.weddingplanner.repository;

import com.weddingplanner.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface EventRepo extends JpaRepository<Event, Long> {
    List<Event> findByStatus(String status);
    List<Event> findByEventDateAfter(Date eventDate);
}
