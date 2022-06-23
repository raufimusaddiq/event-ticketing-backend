package open.source.event.ticketing.service.impl;

import open.source.event.ticketing.entity.Event;
import open.source.event.ticketing.mapper.EventMapper;
import open.source.event.ticketing.repository.EventRepository;
import open.source.event.ticketing.rest.request.CreateEventRequest;
import open.source.event.ticketing.rest.response.EventDTO;
import open.source.event.ticketing.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl implements EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventMapper eventMapper;

    @Override
    public EventDTO createEvent(CreateEventRequest request) {
        Event event = eventMapper.toEntity(request);
        Event savedEvent = eventRepository.save(event);
        return eventMapper.toDto(savedEvent);
    }
}
