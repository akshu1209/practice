package constrPractice;
                    
public class Student {
	int id;
	String name;                         // default constructor
	
	void display()   //method to display the value if id and name
	{
		System.out.println(id+" "+name);
	}

	
	
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.display();
		 s2.display();           // constuctor called when object created   output 0, null  values are provided by default constructor
		
		
	}

}
