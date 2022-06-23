package open.source.event.ticketing.service.impl;

import open.source.event.ticketing.entity.Event;
import open.source.event.ticketing.mapper.EventMapper;
import open.source.event.ticketing.repository.EventRepository;
import open.source.event.ticketing.rest.request.CreateEventRequest;
import open.source.event.ticketing.rest.response.EventDTO;
import open.source.event.ticketing.service.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EventServiceImpl implements EventService {

    private static Logger logger = LoggerFactory.getLogger(EventServiceImpl.class);
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventMapper eventMapper;

    @Override
    public EventDTO createEvent(CreateEventRequest request) {
        Event event = eventMapper.toEntity(request);
        UUID uuid = UUID.randomUUID();
        event.setId(uuid);
        Event savedEvent = eventRepository.save(event);
        return eventMapper.toDto(savedEvent);
    }
}
