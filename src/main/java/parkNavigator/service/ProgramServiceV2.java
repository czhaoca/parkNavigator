package parkNavigator.service;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import parkNavigator.advice.ApiException;
import parkNavigator.advice.ExceptionEnum;
import parkNavigator.domain.Program;
import parkNavigator.domain.ProgramInfo;
import parkNavigator.repository.ProgramRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class ProgramServiceV2 implements ProgramService {

  private final ProgramRepository programRepository;

  @Override
  public List<Program> findByParkId(long parkId) {
    return programRepository.findByParkId(parkId);
  }

  @Override
  public List<Program> findAll() {
    return programRepository.findAll();
  }

  @Override
  public Optional<ProgramInfo> findById(int id) {
    return programRepository.findById(id);
  }

  @Override
  public String delete(Integer programId) {
    Integer queryResult = programRepository.delete(programId);
    if (queryResult != 1) {
      throw new ApiException(ExceptionEnum.EMPTY_RESULT);
    }
    return "program " + programId + " has been deleted";
  }
}
