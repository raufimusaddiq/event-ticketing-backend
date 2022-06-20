package open.source.event.ticketing.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

/**
 * base class for entity will be extended by all entity class
 *
 * @author musaddiqr
 * @version Base.java, v 0.1 19 June 2022 18.54:19 raufi-musaddiq Exp $$
 */

@Data
@Accessors(chain = true)
@MappedSuperclass
public class Base implements Serializable {
  @Id
  @Column(name = "id")
  private UUID id;

  @CreatedDate
  @Column(name = "created_date")
  private Date createdDate;

  @LastModifiedDate
  @Column(name = "modified_date")
  private Date modifiedDate;
}
