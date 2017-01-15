package rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.perry.domain.truck.Truck;

public class TruckRowMapper implements RowMapper<Truck> {

	@Override
	public Truck mapRow(ResultSet rs, int rowNum) throws SQLException {
		Truck truck = new Truck();
		truck.setTruckId(rs.getLong("truck_id"));
		truck.setFirstName(rs.getString("driver_first_name"));
		truck.setLastName(rs.getString("driver_last_name"));
		truck.setInsertBy(rs.getLong("insert_by"));
		truck.setUpdateBy(rs.getLong("update_by"));
		truck.setInsertTime(rs.getLong("insert_time"));
		truck.setUpdateTime(rs.getLong("insert_time"));

		return truck;
	}
}
