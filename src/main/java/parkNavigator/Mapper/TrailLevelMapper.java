package parkNavigator.Mapper;

import org.springframework.jdbc.core.RowMapper;
import parkNavigator.domain.TrailLevel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TrailLevelMapper implements RowMapper<TrailLevel> {

  @Override
  public TrailLevel mapRow(ResultSet rs, int rowNum) throws SQLException {
    TrailLevel ts = new TrailLevel();
    ts.setDistance(rs.getFloat("distance"));
    ts.setDifficulty(rs.getString("difficulty"));
    ts.setDuration(rs.getFloat("duration"));
    return ts;
  }
}
