package parkNavigator.service;

import parkNavigator.repository.DTO.ParkDetailsDto;

public interface ParkDetailsService {

  ParkDetailsDto findByParkId(Integer parkId);

}
