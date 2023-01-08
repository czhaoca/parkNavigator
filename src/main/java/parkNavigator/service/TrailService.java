package parkNavigator.service;

import parkNavigator.repository.DTO.TrailDto;

import java.util.List;

public interface TrailService {
  List<TrailDto> getAllTrails(int parkId);

  List<TrailDto> trailsDivision(int parkId, String seasonName);

  boolean hasHuts(String trailName, int parkId);
}
