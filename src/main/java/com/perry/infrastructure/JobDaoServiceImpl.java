package com.perry.infrastructure;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.perry.domain.Customer;
import com.perry.domain.Job;
import com.perry.domain.Location;

@Named
public class JobDaoServiceImpl implements JobDaoService {

	@Inject
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public Job getById(long id) {
		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("call_id", id);
		Integer testId = namedParameterJdbcTemplate.queryForObject("select call_id from calls where call_id = :call_id",
				params, Integer.class);
		System.out.println(testId);
		Job job = new Job();
		job.setCustomer(new Customer());
		job.setLocation(new Location());
		return job;
	}

}
