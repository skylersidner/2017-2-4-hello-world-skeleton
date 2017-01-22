package com.perry.infrastructure.call;

import java.util.List;

import com.perry.domain.call.Call;
import com.perry.domain.truck.Truck;

public interface CallDaoService {

	List<Call> getByIds(List<Long> ids);

	Call create(Call call);

	List<Call> getAllCalls();

	Truck assignTruck(long callId, long truckId);

	List<Call> getAvailable();

	void unAssignTruck(long callId);

}
