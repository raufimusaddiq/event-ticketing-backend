package open.source.event.ticketing.repository;

import java.util.UUID;
import open.source.event.ticketing.entity.Event;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * jpa repository for event
 *
 * @author musaddiqr
 * @version Event.java, v 0.1 20 June 2022 21.15:22 raufi-musaddiq Exp $$
 */

public interface EventRepository extends JpaRepository<Event, UUID> {

}
