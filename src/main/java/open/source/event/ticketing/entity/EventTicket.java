package open.source.event.ticketing.entity;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Ticket entity class for all events, created to handle if event more than one day
 *
 * @author musaddiqr
 * @version EventTicket.java, v 0.1 19 June 2022 20.30:07 raufi-musaddiq Exp $$
 */

@Entity
@Table(name = "event_ticket")
@Data
@EqualsAndHashCode(callSuper = true)
public class EventTicket extends Base {

  @Column(name = "event_id")
  private String eventId;

  @Column(name = "start_time")
  private LocalDateTime startTime;

  @Column(name = "end_time")
  private LocalDateTime endTime;

  @Column(name = "quota")
  private Integer quota;
}
