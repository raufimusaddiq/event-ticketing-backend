package open.source.event.ticketing.mapper;

import open.source.event.ticketing.entity.Event;
import open.source.event.ticketing.rest.request.CreateEventRequest;
import open.source.event.ticketing.rest.response.EventDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {
    Event toEntity(CreateEventRequest request);
    EventDTO toDto(Event event);

}
