package simplejavathreadproject;

public  class Test {

	public static void main(String[] args) {
		Employee employee=new Employee();
		
	System.out.println(employee.getEmployeeFirstName());
		
	//System.out.println(employee.setEmployeeFirstName("prakash"));This is for String
	employee.setEmployeeFirstName("prakash");
	
	System.out.println(employee.getEmployeeFirstName());
	System.out.println(employee);
	}

}


class Employee{
	
	@Override
	public String toString() {
		return "Employee [employeeFirstName=" + employeeFirstName + "]";
	}
	private String employeeFirstName = "Sameer";
	
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String Syed) {
		employeeFirstName=Syed;
	}
	
	
	//This Method for String
//	public String setEmployeeFirstName(String Syed) {
//		return employeeFirstName=Syed;
//	}
}

