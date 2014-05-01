/**
 * I don't think anyone will live to be over 150. It checks all the prime numbers up to 150.
 * Returns true if the number is prime and false if it isn't.
 * @author Robert
 *
 */
public class EmployeeInfo {
	public boolean PrimeAgeChecker(Employee employee) {
		boolean isPrime = false;
		int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 
				31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 
				79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 
				131, 137, 139, 149, 151};
		
		for(int i = 0; i < prime.length; i++) {
			if (prime[i] == employee.getAge()){
				isPrime = true;
			}
		}
		return isPrime;
	}
}
