package nm.androiddevs.app.model.dao;


import java.util.UUID;
import nm.androiddevs.app.model.entity.NewsItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsItemRepository extends JpaRepository<NewsItemEntity, UUID> {



}
