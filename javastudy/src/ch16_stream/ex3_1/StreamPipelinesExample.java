package ch16_stream.ex3_1;

import java.util.Arrays;
import java.util.List;

public class StreamPipelinesExample {

	public static void main(String[] args) {
		
		List<Member> list = Arrays.asList(
			new Member("ȫ�浿", Member.MALE, 30),
			new Member("�̵���", Member.MALE, 27),
			new Member("�̺���", Member.FEMALE, 25),
			new Member("���ؼ�", Member.MALE, 31)
		);
		
		double ageAvg = list.stream()
				.filter(m -> m.getSex() == Member.MALE)
				.mapToInt(Member::getAge)
				.average()
				.getAsDouble();
		
		System.out.println("���� ��� ���� : " + ageAvg);

	}

}
