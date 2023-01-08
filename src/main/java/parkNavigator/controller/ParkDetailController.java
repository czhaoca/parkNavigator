package parkNavigator.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;

import parkNavigator.advice.ApiException;
import parkNavigator.repository.DTO.ParkDetailsDto;
import parkNavigator.service.ParkDetailsService;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequiredArgsConstructor
public class ParkDetailController {

  @Autowired
  private final ParkDetailsService parkDetailsService;

  @GetMapping("parkdetails/{id}")
  public ParkDetailsDto parkDetailById(@PathVariable int id) {
    return parkDetailsService.findByParkId(id);
  }
}
