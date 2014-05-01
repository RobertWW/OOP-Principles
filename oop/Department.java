
public class Department {
	private Employee[] departmentEmployees;
	public Department() {
	}
	
	/**
	 * iterates through the list and puts employees by name
	 * Starts with the first element and searches through the entire array to see if
	 * there is a smaller number. If there is, swap; and if there isn't, keep going through.
	 * 
	 * It then changes the number being searched after it searches through the entire array
	 * @param employee
	 * @return
	 */
	public Employee[] getEmployeesByAge(Employee[] employee ) {
		for (int i = 0; i < employee.length - 1; i++) {
			for (int p=i; p <= employee.length - 1; p++) {
				if (employee[i].getAge() > employee[p].getAge()) {
					Employee temp;		//Swaps the people if their age is lower
					temp = employee[i];
					employee[i] = employee[p];
					employee[p] = temp;
				}
			}
		}
		this.departmentEmployees = employee;
		return employee;
	}
	public Employee[] getEmployees() {			//Sets the department employees if there are multiple departments
		return this.departmentEmployees;
	}
	
	/**
	 * Just checks if the department is a valid department
	 * @param employee
	 * @return
	 */
	public Employee[] checkDepartments(Employee[] employee) {		//Checks if the department is valid. Nulls if it isn't
		for(int i = 0; i<= employee.length; i++) {
			if (employee[i].getDepartment() != "Accounting" ||
					employee[i].getDepartment() != "Marketing" ||
					employee[i].getDepartment() != "Human Resources" ||
					employee[i].getDepartment() != "Information Systems"
					){
				
				
			employee[i] = null;
			}
		}
		return employee;
	}
}
