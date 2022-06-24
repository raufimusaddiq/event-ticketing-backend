package open.source.event.ticketing.rest.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * request model for register user
 *
 * @author musaddiqr
 * @version RegisterUserRequest.java, v 0.1 22 June 2022 13.19:42 raufi-musaddiq Exp $$
 */

@Data
@NoArgsConstructor
public class RegisterUserRequest {
  @Email
  @NotBlank
  private String email;

  @NotBlank
  private String name;

  @NotBlank
  private String password;

  @NotBlank
  private String phoneNumber;
}
