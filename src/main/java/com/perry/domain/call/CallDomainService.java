package com.perry.domain.call;

import java.util.List;

public interface CallDomainService {

	List<Call> getByIds(List<Long> ids);

	Call create(Call call);

	void assignTruck(long callId, long truckId);

	List<Call> getAllCalls();

	List<Call> getAvailable();

}
