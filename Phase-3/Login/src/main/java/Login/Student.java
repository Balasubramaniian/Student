package Login;

public class Student {
	
	private int id;
	private int age;
	private String Name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Student(int id,String name,int age) {
		super();
		this.id = id;
		this.age = age;
		this.Name = name;
	}

}
