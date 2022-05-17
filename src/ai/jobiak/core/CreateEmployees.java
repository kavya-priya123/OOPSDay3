package ai.jobiak.core;

import java.time.LocalDateTime;

public class CreateEmployees {

	public static void main(String[] args) {
		
		
		Address res = new Address("First Floor123","Sundaram","Hyderabad");
		Address comm = new Address("IIT Campus156","Gachhbowli","Hyderabad");
		
	
	//	Employee emp = new Employee(101,"Kavya",LocalDateTime.now(),res,comm,1);
		Employee emp = Employee.builder()
						.empId(101)
						.fullName("Prayan")
						.dateOfJoining(LocalDateTime.now())
						.residence(res)
						.communication(comm)
						.build();
	System.out.println(emp);
	//to update a composed instance,first obtain the reference of the composed object with get
	 //emp.getResidence().setBuilding("Satyam");
	
	System.out.println(emp);
	
	}

}
