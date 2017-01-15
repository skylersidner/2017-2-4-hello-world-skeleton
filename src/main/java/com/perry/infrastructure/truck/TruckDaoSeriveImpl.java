package com.perry.infrastructure.truck;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.perry.domain.truck.Truck;

import rowmappers.TruckRowMapper;

@Named
public class TruckDaoSeriveImpl implements TruckDaoService {

	@Inject
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<Truck> getByIds(List<Long> truckIds) {
		String sql = "select * from trucks t where t.id in (:truckIds)";
		MapSqlParameterSource params = new MapSqlParameterSource();

		params.addValue("truckIds", truckIds);

		namedParameterJdbcTemplate.query(sql, params, new TruckRowMapper());

		return null;
	}

}
