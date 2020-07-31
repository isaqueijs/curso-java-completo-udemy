package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int id, n;
		String name = new String();
		double percentage, salary;

		System.out.println("How many employees will be registered?");
		n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Emplyoee #" + i + ": ");
			System.out.println("Id: ");
			id = sc.nextInt();

			while (hasId(id, list)) {
				System.out.println("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.println("Name: ");
			sc.nextLine();
			name = sc.nextLine();

			System.out.println("Salary: ");
			salary = sc.nextDouble();

			Employee emp = new Employee(id, name, salary);
			list.add(emp);
		}

		System.out.println("Enter the employee id that will have salary increase:");
		int idCheck = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idCheck).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		}

		System.out.println();

		System.out.println("List of employees:");
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}
	}

	public static boolean hasId(int id, List<Employee> list) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		return emp != null;
	}

}