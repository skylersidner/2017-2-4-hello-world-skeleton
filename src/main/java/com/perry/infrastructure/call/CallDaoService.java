package com.perry.infrastructure.call;

import java.util.List;

import com.perry.domain.call.Call;

public interface CallDaoService {

	List<Call> getByIds(List<Long> ids);

	Call create(Call call);

	List<Call> getAllCalls();

	void assignTruck(long callId, long truckId);

	List<Call> getAvailable();

}
