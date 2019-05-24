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
public class MeetingItemEntity {

  private static EntityLinks entityLinks;

  @Id
  @NonNull
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID meetingId;
  private String meetingDate;
  private String meetingTime;
  private String meetingLocation;
  private String meetingDescription;
  private String MeeitngNewsItem;
  private String meetingPostingMember;
  private String meetingMeetUpsLink;

  @PostConstruct
  private void initEntityLinks() {
    String ignore = entityLinks.toString();
  }

  @Autowired
  private void setEntityLinks(EntityLinks entityLinks) {
    MeetingItemEntity.entityLinks = entityLinks;
  }

  public URI getHref() {
    return entityLinks.linkForSingleResource(MeetingItemEntity.class, meetingId).toUri();

  }
}
