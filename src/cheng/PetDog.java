package cheng;

public class PetDog implements Dog
{
	private String name;
	private int age;
	
	public void setAge(int age)
	{
		System.out.println("Set����,age="+age);
		this.age = age;
	}
	
	public void setName(String name)
	{
		System.out.println("Set����,name="+name);
		this.name = name;
	}
	
	public void bark()
	{
		System.out.println("���ﹷ�ڽ�.....");
		
	}
}
