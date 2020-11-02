package ch11_apis.ex3_4;

public class MemberThin implements Cloneable {
	public String id;
	public String name;
	public String password;
	public int age;
	public boolean adult;
	
	public MemberThin(String id, String name, String password, int age, boolean adult) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.age = age;
		this.adult = adult;
	}
	
	public MemberThin getMember() {
		MemberThin cloned = null;
		try {
			cloned = (MemberThin) clone();
		} catch(CloneNotSupportedException e) {
			
		}
		
		return cloned;
	}
}
