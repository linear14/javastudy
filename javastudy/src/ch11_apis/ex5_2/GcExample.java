package ch11_apis.ex5_2;

public class GcExample {

	public static void main(String[] args) {
		
		Employee employee;
		
		employee = new Employee(1);
		employee = null;
		employee = new Employee(2);
		employee = new Employee(3);
		
		System.out.println("employee�� ���������� �����ϴ� eno: " + employee.eno);
		System.gc();

	}

}

class Employee {
	public int eno;
	
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee(" + eno + ") �� �޸𸮿� ������");
	}
	
	@Override
	public void finalize() {
		System.out.println("Employee(" + eno + ") �� �޸𸮿��� ���ŵ�");
	}
}
