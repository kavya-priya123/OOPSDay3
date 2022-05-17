package ai.jobiak.core;

import java.time.LocalDateTime;

public class CreateEmployee2 {

	public static void main(String[] args) {
	System.out.println(Employee.managerId);
		Address res = new Address("First Floor123","Sundaram","Hyderabad");
		Address comm = new Address("IIT Campus156","Gachhbowli","Hyderabad");
		//Employee emp = new Employee(101,"Kavya",LocalDateTime.now(),res,comm,0);
		Employee emp = Employee.builder()
				.empId(101)
				.fullName("Kavya")
				.dateOfJoining(LocalDateTime.now())
				.residence(res)
				.communication(comm)
				.build();
		
		
		Address resE1 = new Address("#453","Jubilee Hills","Hyderabad");
		Address commE1 = new Address("IIT Campus156","Gachhbowli","Hyderabad");
		//Employee emp1= new Employee(102,"Johnson",LocalDateTime.now(),resE1,commE1,1);
		Employee emp1 = Employee.builder()
				.empId(102)
				.fullName("Johnson")
				.dateOfJoining(LocalDateTime.now())
				.residence(resE1)
				.communication(commE1)
				.build();
		
		Address resE2 = new Address("#145","Madhapur","Hyderabad");
		Address commE2 = new Address("IIT Campus156","Gachhbowli","Hyderabad");
	//	Employee emp2 = new Employee(103,"Jonas",LocalDateTime.now(),resE2,commE2,1);
		Employee emp2 = Employee.builder()
				.empId(102)
				.fullName("Jonas")
				.dateOfJoining(LocalDateTime.now())
				.residence(resE2)
				.communication(commE2)
				.build();
		
		Address resE3 = new Address("#213","Kondapur","Hyderabad");
		Address commE3 = new Address("IIT Campus156","Gachhbowli","Hyderabad");
		//Employee emp3 = new Employee(104,"Sravya",LocalDateTime.now(),resE3,commE3,1);
		Employee emp3 = Employee.builder()
				.empId(104)
				.fullName("Sravya")
				.dateOfJoining(LocalDateTime.now())
				.residence(resE3)
				.communication(commE3)
				.build();
		
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		//assume the manager has changed for the department
		//emp.setManagerId(122);
		System.out.println(emp);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		System.out.println(Employee.managerId);
		 
	}

}
