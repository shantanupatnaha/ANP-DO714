

package com.example;


class Student implements Cloneable
{
	 int Id;
	 String name;
	 String addr;
	
	public Student(int id, String name, String addr) {
		super();
		Id = id;
		this.name = name;
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "Student [Id=" + Id + ", name=" + name + ", addr=" + addr + "]";
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Id;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Student s =(Student)obj;
		return this.Id==s.Id;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}

public class ObjImp {

	public static void main(String[] args) {
	Student obj = new Student(1,"Rohan","delhi");
    System.out.println(obj);
    System.out.println(obj.getClass().getName());
    System.out.println(obj.hashCode());
    System.out.println(Integer.toHexString(obj.hashCode()));
    
    Student obj1 = new Student(2,"Rohan","delhi");
    System.out.println(obj==obj1);
    System.out.println(obj.equals(obj1));
    
    String str1 =new String("Hello");
    String str2 =new String("Hello");
    System.out.println(str1==str2);
    System.out.println(str1.equals(str2));
    
    obj = obj1;
    System.out.println(obj);
    
    obj.name="hello";
    System.out.println(obj1);
    
    try
    {
    Student obj3 =(Student) obj.clone();
    obj3.name="John";
    System.out.println(obj3);
    System.out.println(obj);
    }
    catch(Exception ex)
    {
    	System.out.println(ex);
    }
	
	}

}
