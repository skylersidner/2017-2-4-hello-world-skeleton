package com.perry.domain;

import javax.inject.Inject;
import javax.inject.Named;

import com.perry.infrastructure.JobDaoService;

@Named
public class JobDomainServieImpl implements JobDomainService {

	@Inject
	private JobDaoService jobDaoService;

	@Override
	public Job getById(long id) {
		Job job = jobDaoService.getById(id);
		return job;
	}

}
