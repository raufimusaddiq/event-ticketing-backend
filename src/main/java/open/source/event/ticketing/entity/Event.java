package open.source.event.ticketing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author musaddiqr
 * @version Event.java, v 0.1 19 June 2022 20.24:27 raufi-musaddiq Exp $$
 */

@Entity
@Table(name = "event")
@Data
@EqualsAndHashCode(callSuper = true)
public class Event extends Base{

  @Column(name = "event_organizer_id")
  private String eventOrganizerId;

  @Column(name = "name")
  private String name;

  @Column(name = "total_day")
  private Integer totalDay;

}
