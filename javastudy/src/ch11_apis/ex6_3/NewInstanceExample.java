package ch11_apis.ex6_3;

public class NewInstanceExample {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("ch11_apis.ex6_3.SendAction");
			// Class clazz = Class.forName("ch11_apis.ex6_3.ReceiveAction");
			
			Action action = (Action) clazz.newInstance();
			action.execute();
		} catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}

	}

}
