package nm.androiddevs.app.controller;

import nm.androiddevs.app.model.dao.NewsItemRepository;
import nm.androiddevs.app.model.entity.NewsItemEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.ExposesResourceFor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "news/")
@ExposesResourceFor(NewsItemEntity.class)
public class NewsItemController {

  private final NewsItemRepository newsItemRepository;

  @Autowired
  public NewsItemController(NewsItemRepository newsItemRepository) {
    this.newsItemRepository = newsItemRepository;
  }
}
