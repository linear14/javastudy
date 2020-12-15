package ch14_lambda.ex5_1;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;

public class ConsumerExample {

	public static void main(String[] args) {
		
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> biConsumer = (t, u) -> {
			System.out.println(t+u);
		};
		biConsumer.accept("동현", "최고");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("나이 :" + d + "세");
		doubleConsumer.accept(8.0);
		
	}

}
