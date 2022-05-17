package ai.jobiak.core;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.ToString;
@Builder
@ToString
public class Employee {

int empId;
String fullName;
LocalDateTime dateOfJoining;
Address residence;
Address communication;
static int managerId;
/*
public Employee() {
	
}

public Employee(int empId, String fullName, LocalDateTime dateOfJoining, Address residence, Address communication,
		int managerId) {
	super();
	this.empId = empId;
	this.fullName = fullName;
	this.dateOfJoining = dateOfJoining;
	this.residence = residence;
	this.communication = communication;
	Employee.managerId = managerId;
}

public int getEmpId() {
	return empId;
}

public void setEmpId(int empId) {
	this.empId = empId;
}

public String getFullName() {
	return fullName;
}

public void setFullName(String fullName) {
	this.fullName = fullName;
}

public LocalDateTime getDateOfJoining() {
	return dateOfJoining;
}

public void setDateOfJoining(LocalDateTime dateOfJoining) {
	this.dateOfJoining = dateOfJoining;
}

public Address getResidence() {
	return residence;
}

public void setResidence(Address residence) {
	this.residence = residence;
}

public Address getCommunication() {
	return communication;
}

public void setCommunication(Address communication) {
	this.communication = communication;
}

public int getManagerId() {
	return managerId;
}

public void setManagerId(int managerId) {
	this.managerId = managerId;
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", fullName=" + fullName + ", dateOfJoining=" + dateOfJoining + ", residence="
			+ residence + ", communication=" + communication + ", managerId=" + managerId + "]";
}

*/
}
