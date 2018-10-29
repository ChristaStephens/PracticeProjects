package practice;

public class Family {
	
	//Creating a class called family that will have objects of
	//Parent, children and dog. Parent, children and dog will extend
	//The family class. This class will be abstract
	
	protected String name = "";
	protected int age = 0;
	
	public Family () {}
	

	
	public Family(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	//so that the text that we send to the console looks correct
	@Override
	public String toString() {
		return "\n" + name + ", age " + age ;
	}



}
