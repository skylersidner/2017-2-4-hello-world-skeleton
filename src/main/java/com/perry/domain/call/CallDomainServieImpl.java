package com.perry.domain.call;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.perry.domain.truck.Truck;
import com.perry.infrastructure.call.CallDaoService;

@Named
public class CallDomainServieImpl implements CallDomainService {

	@Inject
	private CallDaoService callDaoService;

	@Override
	public List<Call> getByIds(List<Long> ids) {
		List<Call> callList = callDaoService.getByIds(ids);
		return callList;
	}

	@Override
	public Call create(Call call) {
		Call createdCall = callDaoService.create(call);
		return createdCall;
	}

	@Override
	public List<Call> getAllCalls() {
		List<Call> callList = callDaoService.getAllCalls();
		return callList;
	}

	@Override
	public Truck assignTruck(long callId, long truckId) {
		Truck updatedTruck = callDaoService.assignTruck(callId, truckId);
		return updatedTruck;

	}

	@Override
	public List<Call> getAvailable() {
		List<Call> callList = callDaoService.getAvailable();
		return callList;
	}

	@Override
	public void unAssignTruck(long callId) {
		callDaoService.unAssignTruck(callId);

	}

}
