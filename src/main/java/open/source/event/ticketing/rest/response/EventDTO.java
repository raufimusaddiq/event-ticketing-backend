package open.source.event.ticketing.rest.response;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class EventDTO {

    private String eventOrganizerId;

    private String name;

    private Integer totalDay;

    private String description;

    private String location;
}