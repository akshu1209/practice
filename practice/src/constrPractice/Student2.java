package constrPractice;

public class Student2 {

	
		int id;
		String name;
		Student2(int i,String n)   //creating a parameterized constructor
		{
			id=i;
			name=n;
			
		}
		// method to display the values
		void display() {
			System.out.println(id+" "+name);
			
		}
		public static void main(String[] args) {
			Student2 n=new Student2(111,"akki");
			Student2 n2=new Student2(122,"praju");
			n.display();
			n2.display();
		
		// calling method to display the values of object
			

	}

}
