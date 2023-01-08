package parkNavigator.repository.DTO;

import lombok.Data;

@Data
public class ProgramReservationSearchCond {

  private String reservationNumber;
  private String email;

  public ProgramReservationSearchCond() {

  }

  public ProgramReservationSearchCond(String reservationNumber, String email) {
    this.reservationNumber = reservationNumber;
    this.email = email;
  }
}
