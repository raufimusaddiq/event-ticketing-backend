package open.source.event.ticketing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * user class
 *
 * @author musaddiqr
 * @version User.java, v 0.1 19 June 2022 19.10:23 raufi-musaddiq Exp $$
 */

@Entity
@Table(name = "user")
@Data
@EqualsAndHashCode(callSuper = true)
public class User extends Base{
  @Column(name = "email")
  private String email;

  @Column(name = "phone_number")
  private String phoneNumber;

  @Column(name = "password")
  private String password;

  @Column(name = "verified")
  private boolean verified;
}
