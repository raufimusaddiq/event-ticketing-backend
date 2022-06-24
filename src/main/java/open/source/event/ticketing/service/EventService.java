package open.source.event.ticketing.service;

import open.source.event.ticketing.rest.request.CreateEventRequest;
import open.source.event.ticketing.rest.response.EventDetailResponse;

public interface EventService {

    EventDetailResponse createEvent(CreateEventRequest request);

}
