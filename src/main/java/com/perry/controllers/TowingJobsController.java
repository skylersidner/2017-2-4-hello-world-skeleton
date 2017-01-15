package com.perry.controllers;

import javax.inject.Inject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perry.domain.Customer;
import com.perry.domain.Job;
import com.perry.domain.JobDomainService;
import com.perry.domain.Location;

@RestController
@RequestMapping("/jobs")
public class TowingJobsController {

	@Inject
	private JobDomainService jobDomainService;

	@RequestMapping("/create")
	public Job getJobById() {
		Job job = jobDomainService.getById(1);
		return job;
	}
}
