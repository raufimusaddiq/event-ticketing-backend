package open.source.event.ticketing.repository;

import java.util.UUID;
import open.source.event.ticketing.entity.EventTicket;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * jpa repository for event ticket
 *
 * @author musaddiqr
 * @version EventTicketRepository.java, v 0.1 20 June 2022 21.22:03 raufi-musaddiq Exp $$
 */
public interface EventTicketRepository extends JpaRepository<EventTicket, UUID> {

}
