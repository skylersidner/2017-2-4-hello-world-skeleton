package com.perry.domain;

import java.util.List;

public interface CallDomainService {

	List<Call> getByIds(List<Long> ids);

}
