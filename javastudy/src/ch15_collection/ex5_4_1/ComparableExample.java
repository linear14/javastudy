package ch15_collection.ex5_4_1;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {

	public static void main(String[] args) {
		
		TreeSet<Person> treeSet = new TreeSet<Person>();
		
		treeSet.add(new Person("�̵���", 26));
		treeSet.add(new Person("�̺���", 24));
		treeSet.add(new Person("�����", 30));
		
		Iterator<Person> iterator = treeSet.iterator();
		while(iterator.hasNext()) {
			Person person = iterator.next();
			System.out.println(person.name + " : " + person.age);
		}
		
	}

}
