package open.source.event.ticketing.rest.controller;

import open.source.event.ticketing.rest.request.CreateEventRequest;
import open.source.event.ticketing.rest.response.BaseWebResponse;
import open.source.event.ticketing.rest.response.EventDetailResponse;
import open.source.event.ticketing.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<BaseWebResponse> createEvent(@RequestBody CreateEventRequest request){
        EventDetailResponse eventDetailResponse = eventService.createEvent(request);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header(HttpHeaders.LOCATION, "/api/event/"+ eventDetailResponse.getId())
                .body(BaseWebResponse.successWithData(eventDetailResponse));
    }
}
