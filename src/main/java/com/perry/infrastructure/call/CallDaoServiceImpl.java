package com.perry.infrastructure.call;

import java.time.Instant;
import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.perry.domain.call.Call;

import rowmappers.CallRowMapper;

@Named
public class CallDaoServiceImpl implements CallDaoService {

	@Inject
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<Call> getByIds(List<Long> ids) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("call_ids", ids);

		String sql = "select * from calls where call_id in (:call_ids)";
		List<Call> callList = namedParameterJdbcTemplate.query(sql, params, new CallRowMapper());

		return callList;
	}

	@Override
	public Call create(Call call) {
		String sql = "INSERT INTO public.calls(\r\n" + //
				"            customer_first_name, customer_last_name, pick_up_location, \r\n" + //
				"            drop_off_location, customer_vehicle_year, customer_vehicle_make, \r\n" + //
				"            customer_vehicle_model, customer_vehicle_color, customer_vehicle_license_plate_number, \r\n" + //
				"            customer_phone_number, customer_vehicle_key_location, customer_call_type, \r\n" + //
				"            customer_payment_information, status, insert_by, update_by, truck_id, \r\n" + //
				"            insert_time, update_time)\r\n" + //
				"    VALUES (:customerFirstName, :customerLastName, :pickUpLocation, \r\n" + //
				"            :dropOffLocation, :customerVehicleYear, :customerVehicleMake, \r\n" + //
				"            :customerVehicleModel, :customerVehicleColor, customerVehicleLiscensePlateNumber, \r\n" + //
				"            :customerPhoneNumber, customerVehicleKeyLocation, :customerCallType, \r\n" + //
				"            customerPaymentInformation, :status, :insertBy, :updateBy, :truckId, \r\n" + //
				"            :insertTime, :updateTime)";

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("customerFirstName", call.getCustomer().getFirstName());
		params.addValue("customerLastName", call.getCustomer().getFirstName());
		params.addValue("pickUpLocation", call.getPickUpLocation());
		params.addValue("dropOffLocation", call.getDropOffLocation());
		params.addValue("customerVehicleYear", call.getCustomer().getVehicle().getYear());
		params.addValue("customerVehicleMake", call.getCustomer().getVehicle().getMake());
		params.addValue("customerVehicleModel", call.getCustomer().getVehicle().getMake());
		params.addValue("customerVehicleColor", call.getCustomer().getVehicle().getColor());
		params.addValue("customerVehicleLiscensePlateNumber", call.getCustomer().getVehicle().getLicensePlateNumber());
		params.addValue("customerPhoneNumber", call.getCustomer().getPhoneNumber());
		params.addValue("customerVehicleKeyLocation", call.getCustomer().getVehicle().getKeyLocation().getValue());
		params.addValue("customerCallType", call.getCallType());
		params.addValue("customerPaymentInformation", call.getCustomer().getVehicle().getMake());
		params.addValue("status", call.getCustomer().getVehicle().getMake());
		params.addValue("insertBy", call.getCustomer().getVehicle().getMake());
		params.addValue("updateBy", call.getCustomer().getVehicle().getMake());
		params.addValue("truckId", call.getCustomer().getVehicle().getMake());
		params.addValue("insertTime", Instant.now().getEpochSecond());
		params.addValue("updateTime", Instant.now().getEpochSecond());

		return null;
	}

}
