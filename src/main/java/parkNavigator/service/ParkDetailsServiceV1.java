package parkNavigator.service;

import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import parkNavigator.advice.ApiException;
import parkNavigator.advice.ExceptionEnum;
import parkNavigator.repository.DTO.ParkDetailsDto;
import parkNavigator.repository.ParkDetailsRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class ParkDetailsServiceV1 implements ParkDetailsService {

  private final ParkDetailsRepository parkDetailsRepository;

  @Override
  public ParkDetailsDto findByParkId(Integer parkId) {
    try {
      ParkDetailsDto queryResult = parkDetailsRepository.parkInfoById(parkId);
      return queryResult;
    } catch (DataAccessException e) {
      throw new ApiException(ExceptionEnum.EMPTY_RESULT);
    }
  }
}
