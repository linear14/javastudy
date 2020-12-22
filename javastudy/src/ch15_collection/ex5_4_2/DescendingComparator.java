package ch15_collection.ex5_4_2;

import java.util.Comparator;

public class DescendingComparator implements Comparator<Fruit> {

	@Override
	public int compare(Fruit f0, Fruit f1) {
		if(f0.price < f1.price) {
			return -1;
		} else if(f0.price == f1.price) {
			return 0;
		} else {
			return 1;
		}
	}
	
}
