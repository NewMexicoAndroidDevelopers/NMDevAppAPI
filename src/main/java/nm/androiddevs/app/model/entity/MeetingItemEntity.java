package nm.androiddevs.app.model.entity;


import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Entity
@Component
public class MeetingItemEntity {

  private String date;
  private String time;
  private String location;
  private String description;
  private String newsItem;
  private String postingMember;
  private String meetUpsLink;

}
