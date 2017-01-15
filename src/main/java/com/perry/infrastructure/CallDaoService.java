package com.perry.infrastructure;

import java.util.List;

import com.perry.domain.Call;

public interface CallDaoService {

	List<Call> getByIds(List<Long> ids);
	
}
