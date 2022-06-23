package open.source.event.ticketing.rest.controller;

import open.source.event.ticketing.rest.request.CreateEventRequest;
import open.source.event.ticketing.rest.response.EventDTO;
import open.source.event.ticketing.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/event")
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/")
    public ResponseEntity<EventDTO> createEvent(@RequestBody CreateEventRequest request){
        EventDTO eventDTO = eventService.createEvent(request);
        return ResponseEntity.ok(eventDTO);
    }
}
