package constrPractice;

public class Student4 {
	
	int id;
	String name;
	int age;
	                     // creating two arg const
	Student4(int i,String n){
		id=i;
		name=n;
		
	}
	  // creating three arg const 
	Student4(int i,String n,int a){
		id=i;
		name=n;
		age=a;
	}
	void display() {
		System.out.println(id+" "+name+" "+age);
		
	}
	
	
	public static void main(String[] args) {
		Student4 n=new Student4(111,"akki");
		Student4 n2=new Student4(122,"praju",234);
		n.display();
		n2.display();
		// TODO Auto-generated method stub

	}

}
