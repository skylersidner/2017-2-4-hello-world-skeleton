package com.perry.domain.call;

import java.util.List;

public interface CallDomainService {

	List<Call> getByIds(List<Long> ids);

	Call create(Call call);

	List<Call> getAllCalls();

}
