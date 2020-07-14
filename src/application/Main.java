package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		List<Employer> list = new ArrayList<>();

		System.out.print("How many employees will be registered? ");

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			
			int id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			
			list.add(new Employer(id, name, salary));
		}

		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Integer pos = position(list, id);
		
		if (pos == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			int percent = sc.nextInt();
			list.get(pos).increaseSalary(percent);

		}

		System.out.println();
		System.out.println("List of employees:");
		for (Employer obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

	public static boolean hasId(List<Employer> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return true;
			}
		}

		return false;

	}

	public static Integer position(List<Employer> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}

		}
		return null;
	}
}
