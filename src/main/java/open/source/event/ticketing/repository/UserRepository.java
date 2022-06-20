package open.source.event.ticketing.repository;

import java.util.UUID;
import open.source.event.ticketing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * jpa repository for user
 *
 * @author musaddiqr
 * @version UserRepository.java, v 0.1 20 June 2022 21.10:08 raufi-musaddiq Exp $$
 */

public interface UserRepository extends JpaRepository<UUID, User> {

}
