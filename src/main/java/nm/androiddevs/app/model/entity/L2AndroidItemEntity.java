package nm.androiddevs.app.model.entity;

import java.net.URI;
import java.util.UUID;
import javax.annotation.PostConstruct;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityLinks;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Entity
@Component
public class L2AndroidItemEntity {

  private static EntityLinks entityLinks;
  @Id
  @NonNull
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID L2AndroidItemId;
  private String postingMbr;
  private String link;
  private String shortDescription;
  private String type;

  @PostConstruct
  private void initEntityLinks() {
    String ignore = entityLinks.toString();
  }

  @Autowired
  private void setEntityLinks(EntityLinks entityLinks) {
    L2AndroidItemEntity.entityLinks = entityLinks;
  }

  public URI getHref() {
    return entityLinks.linkForSingleResource(L2AndroidItemEntity.class, L2AndroidItemId).toUri();

  }

}
