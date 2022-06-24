package open.source.event.ticketing.repository;

import java.util.UUID;
import open.source.event.ticketing.entity.Attendee;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * jpa repository for attende entity
 *
 * @author musaddiqr
 * @version AttendeeRepository.java, v 0.1 20 June 2022 21.14:28 raufi-musaddiq Exp $$
 */

public interface AttendeeRepository extends JpaRepository<Attendee, UUID> {

}
