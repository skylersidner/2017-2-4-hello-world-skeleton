package com.perry.controllers;

import java.util.Arrays;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.core.MediaType;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.perry.domain.CallType;
import com.perry.domain.Customer;
import com.perry.domain.KeyLocationType;
import com.perry.domain.Vehicle;
import com.perry.domain.call.Call;
import com.perry.domain.call.CallDomainService;
import com.perry.domain.truck.Truck;

@RestController
@RequestMapping("/calls")
public class CallController {

	@Inject
	private CallDomainService callDomainService;

	@RequestMapping(value = "/{callId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<Call> getJobById(@PathVariable Long callId) {
		List<Call> callList = callDomainService.getByIds(Arrays.asList(callId));
		return callList;
	}

	// @RequestMapping(value = "/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
	// public Call create(@RequestBody Call call) {
	// Call createdCall = callDomainService.create(call);
	// return createdCall;
	// }

	@RequestMapping(value = "/create/{firstName}/{lastName}/{pickUpLocation}/{dropOffLocation}/{keyLocation}/{callType}/{make}/{model}/{year}/{paymentInformation}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
	public Call create(@PathVariable String firstName, @PathVariable String lastName, @PathVariable String pickUpLocation,
			@PathVariable String dropOffLocation, @PathVariable String keyLocation, @PathVariable String callType, @PathVariable String make,
			@PathVariable String model, @PathVariable String year, @PathVariable String paymentInformation) {
		// this feels so bad, but I can't figure out how to do AJAX data opposed to URL params
		Call call = new Call();
		Customer customer = new Customer();
		// customer.setPhoneNumber(phoneNumber);
		Vehicle vehicle = new Vehicle();
		vehicle.setMake(make);
		vehicle.setModel(model);
		vehicle.setYear(year);
		vehicle.setKeyLocationType(KeyLocationType.fromId(Long.valueOf(keyLocation)));
		// vehicle.setLicensePlateNumber(licensePlateNumber);
		customer.setFirstName(firstName);
		customer.setLastName(lastName);
		customer.setVehicle(vehicle);
		call.setCustomer(customer);
		call.setCallType(CallType.fromId(Long.valueOf(callType)));
		call.setPickUpLocation(pickUpLocation);
		call.setDropOffLocation(dropOffLocation);
		Call createdCall = callDomainService.create(call);
		return createdCall;
	}

	@RequestMapping(value = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<Call> getAllCalls() {
		List<Call> callList = callDomainService.getAllCalls();
		return callList;
	}

	@RequestMapping(value = "/available", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<Call> getAvailableCalls() {
		List<Call> callList = callDomainService.getAvailable();
		return callList;
	}

	@RequestMapping(value = "/assign/{callId}/{truckId}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
	public ResponseEntity<Truck> assignTruck(@PathVariable long callId, @PathVariable long truckId) {
		Truck updatedTruck = callDomainService.assignTruck(callId, truckId);
		return new ResponseEntity<Truck>(updatedTruck, HttpStatus.OK);

	}

	@RequestMapping(value = "/unassign/{callId}", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON)
	public void unAssignTruck(@PathVariable long callId) {
		callDomainService.unAssignTruck(callId);

	}
}
