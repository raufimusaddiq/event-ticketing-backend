package open.source.event.ticketing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import open.source.event.ticketing.enumeration.AttendeeStatus;

/**
 * entity that handle event attendee
 *
 * @author musaddiqr
 * @version Attendee.java, v 0.1 19 June 2022 21.07:10 raufi-musaddiq Exp $$
 */

@Entity
@Table(name = "attendee")
@Data
@EqualsAndHashCode(callSuper = true)
public class Attendee extends Base {

  @Column(name = "event_registration_id")
  private String eventRegistrationId;

  @Column(name = "user_id")
  private String userId;

  @Column(name = "event_ticket_id")
  private String eventTicketId;

  @Enumerated(EnumType.STRING)
  @Column(name = "status")
  private AttendeeStatus status;

  @Column(name = "qr")
  private String qr;
}
