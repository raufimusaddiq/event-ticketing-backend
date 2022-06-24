package open.source.event.ticketing.service;

import java.util.UUID;
import open.source.event.ticketing.rest.request.RegisterUserRequest;

/**
 * service for user
 *
 * @author musaddiqr
 * @version UserService.java, v 0.1 23 June 2022 22.25:40 raufi-musaddiq Exp $$
 */

public interface UserService {
  UUID register(RegisterUserRequest registerRequest);
}
