package parkNavigator.repository;

import java.util.List;
import java.util.Optional;
import parkNavigator.domain.Program;
import parkNavigator.domain.ProgramInfo;

public interface ProgramRepository {

  ProgramInfo save(ProgramInfo programInfo);

  List<Program> findAll();

  List<Program> findByParkId(long parkId);

  Optional<ProgramInfo> findById(int id);

  Integer delete(Integer id);
}
