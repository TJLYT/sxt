
package testPerson;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import test1.Person;

public class perTest {
	public static void main(String[] args) {
		
		Person p1 = new Person(100);
		Person p2 = new Person(200);
		Person p3 = new Person(300);
		Person p4 = new Person(400);
		Person p5 = new Person(500);
//		List<Person> personList = new ArrayList<>();
		ArrayList<Person> personList = new ArrayList<>();
		
		personList.add(p1);
		personList.add(p2);
		personList.add(p3);
		personList.add(p4);
		personList.add(p5);
		
		List<Person> List = findMatchPerson(personList, p -> p.getPrice()>100 );
		System.out.println(List);
		
	}
	public static   List<Person> findMatchPerson(List<Person> list ,Predicate<Person> predicate){
		
		List<Person> List = new ArrayList<>();
		
		for(Person p : list){
			if(predicate.test(p)){
				List.add(p);
			}
		}
		
		return List;
	}
}
