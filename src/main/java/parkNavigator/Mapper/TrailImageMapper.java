package parkNavigator.Mapper;

import org.springframework.jdbc.core.RowMapper;
import parkNavigator.domain.TrailImage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TrailImageMapper implements RowMapper<TrailImage> {

  @Override
  public TrailImage mapRow(ResultSet rs, int rowNum) throws SQLException {
    TrailImage ts = new TrailImage();
    ts.setTrailName(rs.getString("trail_name"));
    ts.setParkId(rs.getInt("park_id"));
    ts.setDifficulty(rs.getString("difficulty"));
    ts.setImageUrl(rs.getString("image_url"));
    return ts;
  }
}
