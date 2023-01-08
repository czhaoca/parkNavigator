package parkNavigator.service;

import java.util.List;

import parkNavigator.domain.ProgramInfo;
import parkNavigator.domain.ProgramReservation;
import parkNavigator.repository.DTO.ProgramReservationSearchCond;
import parkNavigator.repository.DTO.ReservationInfoDto;
import parkNavigator.repository.DTO.ReservationRequestDto;

public interface ProgramReservationService {

  ProgramReservation save(ReservationRequestDto param);

  List<ReservationInfoDto> findByCond(ProgramReservationSearchCond cond);

  ReservationInfoDto update(ReservationRequestDto updateParam);

  String delete(String reservationNumber);

  List<ProgramInfo> findByEmail(String email);
}
