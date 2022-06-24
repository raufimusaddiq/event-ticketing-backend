package open.source.event.ticketing.mapper;

import open.source.event.ticketing.entity.Event;
import open.source.event.ticketing.rest.request.CreateEventRequest;
import open.source.event.ticketing.rest.response.EventDetailResponse;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EventMapper {
    Event toEntity(CreateEventRequest request);
    EventDetailResponse toDto(Event event);

}
