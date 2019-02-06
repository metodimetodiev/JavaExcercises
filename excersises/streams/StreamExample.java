package streams;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.omg.Messaging.SyncScopeHelper;

public class StreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> list = new LinkedList<Employee>();
		try {
			list.add(new Employee("Petar", 1200, 23));
			list.add(new Employee("Ivaylo", 900, 20));
			list.add(new Employee("Maria", 950, 31));
			list.add(new Employee("Ivan", 1000, 32));
		} catch (Exception e) {
			return;
		}
		getRich(list);
		getRichSortedByAge(list);
	}
	public static void getRich(List<Employee> list){
		System.out.println("People with salary greater than 1000");
		
		list.stream()
		.filter(e -> e.getSalary()>= 1000)
		.sorted((e1,e2) -> e1.getName().compareTo(e2.getName()))
		.forEach(e-> System.out.println(e.name + " has "+ e.getSalary()));
	}
	public static void getRichSortedByAge(List<Employee> list){
		System.out.println("\nPeople with salary greater than 1000 sorted by age");
		
		list.stream()
		.filter(e -> e.getSalary() >= 1000)
		.sorted((e1, e2) -> e1.getAge()>=e2.getAge()?1:-1)
		.map(e -> e.name.toUpperCase() + " has " + e.getSalary())
		.forEach(System.out::println);
	}
	
		
 
}
