package parkNavigator.Mapper;

import org.springframework.jdbc.core.RowMapper;
import parkNavigator.domain.RestrictedPark;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RestrictedParkMapper implements RowMapper {
  @Override
  public RestrictedPark mapRow(ResultSet rs, int rowNum) throws SQLException {
    RestrictedPark park = new RestrictedPark(rs.getInt("id"));
    park.setDailyCapacity(rs.getInt("daily_capacity"));
    park.setPermitType(rs.getString("permit_type"));
    return park;
  }
}
