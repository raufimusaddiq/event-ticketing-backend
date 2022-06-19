package open.source.event.ticketing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author musaddiqr
 * @version EventOrganizer.java, v 0.1 19 June 2022 20.19:30 raufi-musaddiq Exp $$
 */

@Entity
@Table(name = "event_organizer")
@Data
@EqualsAndHashCode(callSuper = true)
public class EventOrganizer extends Base{

  @Column(name = "user_id")
  private String userId;

  @Column(name = "organization")
  private String organization;

}
