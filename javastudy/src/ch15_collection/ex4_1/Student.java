package ch15_collection.ex4_1;

public class Student {
	
	public int sno;
	public String name;
	
	public Student(int sno, String name) {
		super();
		this.sno = sno;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return sno + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student stu = (Student) obj;
			return (sno == stu.sno) && (name.equals(stu.name));
		} else {
			return false;
		}
	}
	
	
}
