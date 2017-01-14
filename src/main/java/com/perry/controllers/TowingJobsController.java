package com.perry.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.perry.domain.Customer;
import com.perry.domain.Job;
import com.perry.domain.Location;

@RestController
@RequestMapping("/jobs")
public class TowingJobsController {

	@RequestMapping("/create")
	public Job getJobById() {
		Job job = new Job();
		job.setCustomer(new Customer());
		job.setLocation(new Location());
		return job;
	}
}
