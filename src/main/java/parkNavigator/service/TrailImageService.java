package parkNavigator.service;

import parkNavigator.repository.TrailRepository;
import parkNavigator.repository.TrailsImageRepositoryV1;

import javax.sql.DataSource;
import java.util.List;

public class TrailImageService {
  private TrailsImageRepositoryV1 trailsImageRepository;

  public TrailImageService(DataSource dataSource) {
    trailsImageRepository = new TrailsImageRepositoryV1(dataSource);
  }

  public List<String> getImages(int parkId, String trailName) {
    return trailsImageRepository.getImagesByTrail(trailName, parkId);
  }
}
