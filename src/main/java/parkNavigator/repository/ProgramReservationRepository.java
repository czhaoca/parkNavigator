package parkNavigator.repository;

import java.util.List;

import parkNavigator.domain.ProgramInfo;
import parkNavigator.domain.ProgramReservation;
import parkNavigator.repository.DTO.ProgramReservationSearchCond;
import parkNavigator.repository.DTO.ReservationInfoDto;
import parkNavigator.repository.DTO.ReservationRequestDto;

public interface ProgramReservationRepository {

  Integer save(ProgramReservation programReservation);

  Integer update(ReservationRequestDto updateParam);

  Integer delete(String reservationNumer);

  List<ReservationInfoDto> findAll(ProgramReservationSearchCond cond);

  ProgramReservation findByReservationNumber(String reservationNumber);

  ReservationInfoDto findInfoByReservationNumber(String reservationNumber);

  List<ProgramInfo> findInfoByEmail(String email);
}
