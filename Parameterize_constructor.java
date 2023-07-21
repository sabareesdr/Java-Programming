package sdr;
class Student
{
	int id;
    String name;
    
    Student(int i,String n)
    {
    	id=i;
    	name=n;
    }
    void display()
    {
    	System.out.println(id+ " " +name);
    }
}
public class Parameterize_constructor
{

	public static void main(String[] args)
	{
		Student s1=new Student(101,"Jaya");
		Student s2=new Student(102,"Vasu");
		Student s3=new Student(103,"Vel");
		Student s4=new Student(104,"Hari");
		
		s1.display();
		s2.display();
		s3.display();;
		s4.display();
		
	}

}
