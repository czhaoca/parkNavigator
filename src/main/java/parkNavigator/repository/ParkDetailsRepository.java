package parkNavigator.repository;

import parkNavigator.repository.DTO.ParkDetailsDto;

public interface ParkDetailsRepository {

  ParkDetailsDto parkInfoById(Integer parkId);

}
