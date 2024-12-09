package sample2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students = { 
				new Student("Wlasenko", 19),
				new Student("Petrov", 21),
				new Student("Borisenko", 22),
				new Student("Cherepenko", 20)
				}; 
		List<Student> sortedStudents = Arrays.stream(students) 
				.filter(student -> student.getAge() > 20) 
				.sorted((s1, s2) -> s1.getLastName()
						.compareTo(s2.getLastName())) 
				.collect(Collectors.toList()); 
		System.out.println(sortedStudents); 
	}

}
class Student { 
	private String lastName; 
	private int age; 
	public Student(String lastName, int age) { 
		this.lastName = lastName; 
		this.age = age;
		} 
	public String getLastName() { 
		return lastName; 
		}
	public int getAge() {
		return age; 
		} 
	@Override
	public String toString() {
		return lastName + " (" + age + ")"; 
		}
	}
