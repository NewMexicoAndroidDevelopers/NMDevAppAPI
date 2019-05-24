package nm.androiddevs.app.model.entity;


import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Entity
@Component
public class NewsItemEntity {

  private String link;
  private String description;
  private String type;
  private String postingMember;

}
