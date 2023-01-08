package parkNavigator.service;

import parkNavigator.domain.Program;

import java.util.List;
import java.util.Optional;
import parkNavigator.domain.ProgramInfo;

public interface ProgramService {
  List<Program> findByParkId(long parkId);

  List<Program> findAll();

  Optional<ProgramInfo> findById(int id);

  String delete(Integer programId);
}
