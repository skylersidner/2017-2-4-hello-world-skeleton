package com.perry.controllers;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perry.domain.call.Call;
import com.perry.domain.call.CallDomainService;

@RestController
@RequestMapping("/calls")
public class CallsController {

	@Inject
	private CallDomainService callDomainService;

	@RequestMapping(value = "/{callId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<Call> getJobById(@PathVariable Long callId) {
		List<Call> callList = callDomainService.getByIds(Arrays.asList(callId));
		return callList;
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
	public Call create(@RequestBody Call call) {
		Call createdCall = callDomainService.create(call);
		return createdCall;
	}
}
