package open.source.event.ticketing.service;

import open.source.event.ticketing.rest.request.CreateEventRequest;
import open.source.event.ticketing.rest.response.EventDTO;

public interface EventService {

    EventDTO createEvent(CreateEventRequest request);

}
