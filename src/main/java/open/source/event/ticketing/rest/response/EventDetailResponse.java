package open.source.event.ticketing.rest.response;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@Data
public class EventDetailResponse {

    private UUID id;

    private String eventOrganizerId;

    private String name;

    private Integer totalDay;

    private String description;

    private String location;
}
