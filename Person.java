package edu.neu.csye6200;


public class Person extends AbstractPerson{
	
	private int id;
	private int age;
	private String name;
	private int weightLbs;
	private int weightLossLbs;
	public Person(String csv) {
		String[] tokens = csv.split(",");
		id=Integer.parseInt(tokens[0]);
		age =Integer.parseInt(tokens[1]);
		name=tokens[2];
		weightLbs=Integer.parseInt(tokens[3]);
		weightLossLbs=Integer.parseInt(tokens[4]);
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return id;
	}
	@Override
	public void setId(int id) {
		// TODO Auto-generated method stub
		this.id=id;
		
	}
	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return age;
	}
	@Override
	public void setAge(int age) {
		// TODO Auto-generated method stub
		this.age=age;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}
	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name=name;
	}
	@Override
	public int getWeightLbs() {
		// TODO Auto-generated method stub
		return weightLbs;
	}
	@Override
	public void setWeightLbs(int weightLbs) {
		// TODO Auto-generated method stub
		this.weightLbs=weightLbs;
	}
	@Override
	public int getWeightLossLbs() {
		// TODO Auto-generated method stub
		return weightLossLbs;
	}
	@Override
	public void setWeightLossLbs(int weightLossLbs) {
		// TODO Auto-generated method stub
		this.weightLossLbs=weightLossLbs;
	}
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + ", weightLbs=" + weightLbs + ", weightLossLbs="
				+ weightLossLbs + "]";
	}
	
}
	
	


