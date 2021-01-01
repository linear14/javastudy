package ch16_stream.ex3_1;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
			new Member("홍길동", Member.MALE, 30),
			new Member("이동현", Member.MALE, 27),
			new Member("이보람", Member.FEMALE, 25),
			new Member("정해성", Member.MALE, 31)
		);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		
		System.out.println("남자 평균 나이 : " + ageAvg);

	}

}
