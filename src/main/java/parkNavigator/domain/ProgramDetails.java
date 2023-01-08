package parkNavigator.domain;

import lombok.Data;

@Data
public class ProgramDetails extends ProgramInfo {
  private int parkId;
  private String centerName;
  private String email;
  private String centerAddress;

  public ProgramDetails() {

  }

}
