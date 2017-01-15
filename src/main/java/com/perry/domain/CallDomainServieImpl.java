package com.perry.domain;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import com.perry.infrastructure.CallDaoService;

@Named
public class CallDomainServieImpl implements CallDomainService {

	@Inject
	private CallDaoService jobDaoService;

	@Override
	public List<Call> getByIds(List<Long> ids) {
		List<Call> callList = jobDaoService.getByIds(ids);
		return callList;
	}

}
