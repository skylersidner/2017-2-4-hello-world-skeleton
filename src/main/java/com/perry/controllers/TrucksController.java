package com.perry.controllers;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perry.domain.call.Call;
import com.perry.domain.call.CallDomainService;

@RestController
@RequestMapping("/trucks")
public class TrucksController {

	@Inject
	private CallDomainService jobDomainService;

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<Call> getJobById(@PathVariable Long jobId) {
		List<Call> callList = jobDomainService.getByIds(Arrays.asList(jobId));
		return callList;
	}
}
