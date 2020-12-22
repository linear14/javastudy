package ch15_collection.ex5_4_2;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparatorExample {

	public static void main(String[] args) {
		
		TreeSet<Fruit> treeSet = new TreeSet<Fruit>(new DescendingComparator());
		treeSet.add(new Fruit("����", 3000));
		treeSet.add(new Fruit("����", 10000));
		treeSet.add(new Fruit("����", 5000));
		
		Iterator<Fruit> iter = treeSet.iterator();
		while(iter.hasNext()) {
			Fruit fruit = iter.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}

	}

}
