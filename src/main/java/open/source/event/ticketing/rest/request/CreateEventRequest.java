package open.source.event.ticketing.rest.request;

import lombok.Data;

@Data
public class CreateEventRequest {

    private String eventOrganizerId;

    private String name;

    private Integer totalDay;

    private String description;

    private String location;
}
