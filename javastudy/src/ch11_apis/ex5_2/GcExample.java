package ch11_apis.ex5_2;

public class GcExample {

	public static void main(String[] args) {
		
		Employee employee;
		
		employee = new Employee(1);
		employee = null;
		employee = new Employee(2);
		employee = new Employee(3);
		
		System.out.println("employee가 최종적으로 참조하는 eno: " + employee.eno);
		System.gc();

	}

}

class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") 가 메모리에 생성됨");
	}
	
	@Override
	public void finalize() {
		System.out.println("Employee(" + eno + ") 가 메모리에서 제거됨");
	}
}
