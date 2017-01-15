package com.perry.domain.truck;

import java.util.List;

public interface TruckDomainService {

	List<Truck> getByIds(List<Long> truckIds);
}
