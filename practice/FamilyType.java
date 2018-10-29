package practice;

public class FamilyType extends Family {

	protected String parent ="";
	protected String child = "";
	
	public FamilyType() {}
	
	public FamilyType (String name, int age, String parent, String child) {
		super();
		this.name=name;
		this.age=age;
		this.parent=parent;
		this.child=child;
	}
	
	public String getName() {
		return this.name=name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getAge() {
		return this.age=age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public String getParent() {
		return this.parent=parent;
	}
	
	public void setParent(String parent) {
		this.parent=parent;
	}
	
	public String getChild() {
		return this.child=child;
	}
	
	public void setChild(String child) {
		this.child=child;
	}

	@Override
	public String toString() {
		return "\n" + name + " " + "'s age is  " +age +". \n"
	+name +" has a child, "+ child+ ".\n" + child+"'s grand parents are " +parent ;
	};
	
	
	
	
	
}
