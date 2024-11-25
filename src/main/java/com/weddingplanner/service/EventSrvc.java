package com.weddingplanner.service;

import com.weddingplanner.model.Event;
import com.weddingplanner.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventSrvc {

    @Autowired
    private EventRepo eventRepo;

    public Event createEvent(Event event) {
        return eventRepo.save(event);
    }

    public List<Event> getUpcomingEvents() {
        return eventRepo.findByStatus("Upcoming");
    }

    public List<Event> getCompletedEvents() {
        return eventRepo.findByStatus("Completed");
    }

    public Event getEventById(Long id) {
        return eventRepo.findById(id).orElseThrow();
    }
}
