package parkNavigator.Mapper;

import org.springframework.jdbc.core.RowMapper;
import parkNavigator.domain.Countries;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryMapper implements RowMapper {
  @Override
  public Countries mapRow(ResultSet rs, int rowNum) throws SQLException {
    Countries countries = new Countries();
    countries.setCname(rs.getString("COUNTRY_NAME"));
    return countries;
  }
}
