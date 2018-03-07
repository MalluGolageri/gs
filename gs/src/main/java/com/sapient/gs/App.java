package com.sapient.gs;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws CloneNotSupportedException {
//		Map<Employee, Double> map = new HashMap<Employee, Double>();
//		
//		System.out.println("ab:"+"ab".hashCode()); //97*31+98=3105
//		System.out.println("bC:"+"bC".hashCode()); // 98*31+67 = 3105
//		Employee e1 = new Employee(10, "mallu");
//		Employee e2 = new Employee(20, "ab");
//		Employee e3 = new Employee(20, "bC");
//		System.out.println("e1:"+e1.hashCode()+" e2:"+e2.hashCode());
//		map.put(e1, (double) 10000);
//		map.put(e2, (double) 20000);
//		map.put(e3, (double) 30000);
//		
//		map.forEach((k, v) -> {
//			System.out.println(k.getId() + " " + v);
//		});
//		
//		//
//		
//		Course c=new Course("maths");
//		Student s=new Student(c);
//		
//		Student s2=(Student)s.clone();
//		System.out.println(s2.course.name);
//		s2.course.name="Hindi";
//		System.out.println(s.course.name);
		System.out.println((2^4));
		
	}
}

class Employee {
	private final String name;
	private final int id;
	private double salary;

	public Employee(int id, String name) {
		this.name = name;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	// public void setId(int id) {
	// this.id = id;
	// }
	// private void setName(String name) {
	// this.name = name;
	// }
	private String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	public int hashCode() {		
//		return Objects.hash(this.getId(),this.getName());
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		Employee e = (Employee) obj;
//		return e.getName().equals(this.getName()) && e.getId() == id;
//	}
}


class Student implements Cloneable {
	Course course;
	public Student(Course course){
		this.course=course;
	}	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

 class Course {
	String name;
	public Course(String name) {
		this.name=name;
	}
}
