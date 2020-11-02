package ch11_apis.ex3_4;

public class MemberDeepExample {

	public static void main(String[] args) {
		MemberDeep original = new MemberDeep("ȫ�浿", 25, new int[] {90, 99}, new Car("�ҳ�Ÿ"));
		
		MemberDeep cloned = original.getMember();
		cloned.scores[0] = 40;
		cloned.car.model = "�׷���";
		
		System.out.println("[���� ��ü�� �ʵ尪]");
		System.out.println("name : " + original.name);
		System.out.println("age : " + original.age);
		System.out.println("scores : " + original.scores[0] + ", " + original.scores[1]);
		System.out.println("car model : " + original.car.model);
		
		System.out.println();
		
		System.out.println("[������ ��ü�� �ʵ尪]");
		System.out.println("name : " + cloned.name);
		System.out.println("age : " + cloned.age);
		System.out.println("scores : " + cloned.scores[0] + ", " + cloned.scores[1]);
		System.out.println("car model : " + cloned.car.model);
	}

}
