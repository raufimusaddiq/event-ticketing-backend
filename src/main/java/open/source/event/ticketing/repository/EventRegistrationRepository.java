package open.source.event.ticketing.repository;

import java.util.UUID;
import open.source.event.ticketing.entity.EventRegistration;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * jpa repository for registration
 *
 * @author musaddiqr
 * @version EventRegistrationRepository.java, v 0.1 20 June 2022 21.19:17 raufi-musaddiq Exp $$
 */
public interface EventRegistrationRepository extends JpaRepository<UUID, EventRegistration> {

}
