package parkNavigator.controller;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;
import parkNavigator.advice.ApiException;
import parkNavigator.advice.ExceptionResponse;
import parkNavigator.domain.ProgramInfo;
import parkNavigator.domain.ProgramReservation;
import parkNavigator.repository.DTO.ProgramReservationSearchCond;
import parkNavigator.repository.DTO.ReservationInfoDto;
import parkNavigator.repository.DTO.ReservationRequestDto;
import parkNavigator.service.ProgramReservationService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("reservation")
@RequiredArgsConstructor
public class ProgramReservationController {

  @Autowired
  private final ProgramReservationService programReservationService;

  @PostMapping
  public String makeReservation(@RequestBody ReservationRequestDto param) {
    ProgramReservation reserved = programReservationService.save(param);
    return reserved.getReservationNumber();
  }

  @PatchMapping
  public ReservationInfoDto updateReservation(@RequestBody ReservationRequestDto param) {
    return programReservationService.update(param);
  }

  @GetMapping
  public List<ReservationInfoDto> findReservationByCond(
      @ModelAttribute ProgramReservationSearchCond cond) {
    List<ReservationInfoDto> result = programReservationService.findByCond(cond);
    System.out.println("result " + result);
    return result;
  }

  @GetMapping("{email}")
  public List<ProgramInfo> findReservationByEmail(
      @PathVariable String email) {
    System.out.print("email" + email);
    List<ProgramInfo> result = programReservationService.findByEmail(email);
    System.out.println("result " + result);
    return result;
  }

  @DeleteMapping("{reservationNumber}")
  public String deleteReservation(@PathVariable String reservationNumber) {
    return programReservationService.delete(reservationNumber);
  }

  @PutMapping("test1/{reservationNumber}")
  public ResponseEntity<?> test(@PathVariable String reservationNumber) {
    String result = programReservationService.delete(reservationNumber);
    return ResponseEntity.ok().body(result);
  }

  @GetMapping("test")
  public String test(HttpServletRequest request, HttpServletResponse response, Model model) {
    System.out.println("request : " + request);
    return "test!";
  }

  // @ExceptionHandler(ApiException.class)
  // public ResponseEntity<String> handleNoSuchElementFoundException(ApiException
  // exception) {
  // return
  // ResponseEntity.status(HttpStatus.NOT_FOUND).body(exception.getMessage());
  // }

  // @ExceptionHandler({ApiException.class})
  // protected ResponseEntity<String> handleCustomcException(ApiException e) {
  // System.out.println("handleCustomException throw CustomException : {}" + e);
  // return
  // ResponseEntity.status(e.getError().getStatus()).body(e.getError().getMessage());
  // //return new ResponseEntity<Object>(e.getError().getStatus(),
  // e.getError().getStatus());
  // }

  @ExceptionHandler(ApiException.class)
  public ResponseEntity<ExceptionResponse> handleUserNotFoundException(ApiException ex,
      WebRequest request) {
    final ExceptionResponse exceptionResponse = new ExceptionResponse(ex.getError().getCode(), ex.getMessage());
    ResponseEntity.BodyBuilder builder;
    builder = ResponseEntity.status(ex.getError().getStatus());
    System.out.println("exceptionRespons : " + exceptionResponse);
    // return new ResponseEntity<String>("hi", ex.getError().getStatus());
    return builder.body(exceptionResponse);
  }
}
