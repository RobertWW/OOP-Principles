public class Company {
	public static void main(String args[]) {
		/**
		 * Adds all of the employees
		 */
		EmployeeInfo info = new EmployeeInfo();
		Employee one = new Employee("Counting Guru", 55, "Accounting");
		Employee two = new Employee("Countring Pro", 45, "Accounting");
		Employee three = new Employee("Counting Savvy", 40, "Accounting");
		Employee four = new Employee("Counting Novice", 25, "Accounting");
		Employee five = new Employee("Sales Guru", 50, "Marketing");
		Employee six = new Employee("Sales Pro", 48, "Marketing");
		Employee seven = new Employee("Sales Savvy", 38, "Marketing");
		Employee eight = new Employee("Hiring Guru", 58, "Human Resources");
		Employee nine = new Employee("Hiring Pro", 47, "Human Resources");
		Employee ten = new Employee("Hacking Pro", 46, "Information Systems");
		Employee eleven = new Employee("Hacking Guru", 51, "Information Systems");
		Employee twelve = new Employee("Hacking Savvy", 38, "Information Systems");
		Employee thirteen = new Employee("Hacking Novice", 23, "Information Systems");
		Employee[] employeeArray = {one, two, three, four, five, six, seven,
				eight, nine, ten, eleven, twelve, thirteen};
		/**
		 * If the departments are "Marketing" or "Human Resources," then it will print out all their
		 * information, regardless of age.
		 */
		for (int i = 0; i < employeeArray.length; i++) {
			if(employeeArray[i].getDepartment() == "Marketing" || employeeArray[i].getDepartment() == "Human Resources") {
				System.out.println("Name: " + employeeArray[i].getName() + "\n" +
						" Age: " + employeeArray[i].getAge() + "\n"  +
						" Department: " + employeeArray[i].getDepartment() + "\n" +
						"Prime numbered age: " + info.PrimeAgeChecker(employeeArray[i]) + "\n"); 
				}	
		};
		Department department = new Department();
		Employee[] departmentArray = {};
		departmentArray = department.getEmployeesByAge(employeeArray);	//Creates array by age
		
		/**
		 * Prints all all IS people by order of age.
		 */
		for (int i = 0; i < departmentArray.length; i++) {
			if(employeeArray[i].getDepartment() == "Information Systems") {
				System.out.println("Name: " + employeeArray[i].getName() + "\n" +
						" Age: " + employeeArray[i].getAge() + "\n"  +
						" Department: " + employeeArray[i].getDepartment() + "\n" +
						"Prime numbered age: " + info.PrimeAgeChecker(departmentArray[i]) + "\n"); 
				}	
		};
		/**
		 * Prints out all Accounting people by order of age.
		 */
		for (int i = 0; i < departmentArray.length; i++) {
			if(employeeArray[i].getDepartment() == "Accounting") {
				System.out.println("Name: " + employeeArray[i].getName() + "\n" +
						" Age: " + employeeArray[i].getAge() + "\n"  +
						" Department: " + employeeArray[i].getDepartment() + "\n" +
						"Prime numbered age: " + info.PrimeAgeChecker(departmentArray[i]) + "\n"); 
				}	
		};
		
	}
}
