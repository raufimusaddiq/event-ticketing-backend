package open.source.event.ticketing.rest.response;

import java.util.UUID;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * user detail response
 *
 * @author musaddiqr
 * @version UserDetailResponse.java, v 0.1 22 June 2022 13.24:34 raufi-musaddiq Exp $$
 */

@Data
@NoArgsConstructor
public class UserDetailResponse {
  private UUID id;

  private String email;

  private String name;

  private String phoneNumber;
}
