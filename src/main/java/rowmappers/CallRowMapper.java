package rowmappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.perry.domain.Call;
import com.perry.domain.Customer;
import com.perry.domain.Location;

public class CallRowMapper implements RowMapper<Call> {

	@Override
	public Call mapRow(ResultSet rs, int rowNum) throws SQLException {
		Call call = new Call();
		Customer customer = new Customer();
		customer.setFirstName(rs.getString("customer_first_name"));
		customer.setLastName(rs.getString("customer_last_name"));
		customer.setPhoneNumber(rs.getString("customer_phone_number"));

		Location location = new Location();
		location.setHouseNumber("Fake House Number");
		location.setState("NE");
		location.setStreetName("Fake Street Name");
		location.setZipCode("1233445");

		call.setCustomer(customer);
		call.setLocation(location);

		return call;
	}
}
