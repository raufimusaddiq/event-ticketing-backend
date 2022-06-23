package open.source.event.ticketing.repository;

import java.util.UUID;
import open.source.event.ticketing.entity.EventOrganizer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * jpa repository for event organizer data
 *
 * @author musaddiqr
 * @version EventOrganizer.java, v 0.1 20 June 2022 21.16:15 raufi-musaddiq Exp $$
 */
public interface EventOrganizerRepository extends JpaRepository<EventOrganizer, UUID> {

}
