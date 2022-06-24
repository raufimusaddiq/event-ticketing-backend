package open.source.event.ticketing.service.impl;

import lombok.extern.slf4j.Slf4j;
import open.source.event.ticketing.entity.Event;
import open.source.event.ticketing.mapper.EventMapper;
import open.source.event.ticketing.repository.EventRepository;
import open.source.event.ticketing.rest.request.CreateEventRequest;
import open.source.event.ticketing.rest.response.EventDetailResponse;
import open.source.event.ticketing.service.EventService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EventServiceImpl implements EventService {
    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private EventMapper eventMapper;

    @Override
    public EventDetailResponse createEvent(CreateEventRequest request) {
        Event event = eventMapper.toEntity(request);
        Event savedEvent = eventRepository.save(event);
        return eventMapper.toDto(savedEvent);
    }
}
