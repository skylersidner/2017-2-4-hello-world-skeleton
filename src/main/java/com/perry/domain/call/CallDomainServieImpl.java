package com.perry.domain.call;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

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

}
