package open.source.event.ticketing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import open.source.event.ticketing.enumeration.RegisterStatus;

/**
 * table that handle registering process to ticket (ticket buying)
 *
 * @author musaddiqr
 * @version Register.java, v 0.1 19 June 2022 20.39:18 raufi-musaddiq Exp $$
 */

@Entity
@Table(name = "event_registration", schema = "public")
public class EventRegistration extends Base {

  @Column(name = "event_ticket_id")
  private String eventTicketId;

  @Column(name = "user_id")
  private String userId;

  @Enumerated(EnumType.STRING)
  @Column(name = "status")
  private RegisterStatus status;
}
