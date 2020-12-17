package ch14_lambda.ex5_8;

import java.util.function.BinaryOperator;

public class OperatorMinByMaxByExample {

	public static void main(String[] args) {
		
		BinaryOperator<Fruit> binaryOperator;
		Fruit fruit;
		
		binaryOperator = BinaryOperator.minBy(
			(f1, f2) -> Integer.compare(f1.getPrice(), f2.getPrice())
		);
		fruit = binaryOperator.apply(new Fruit("»ç°ú", 3000), new Fruit("°¨", 2000));
		System.out.println("PRICE MIN " + fruit.getName());

	}

}
