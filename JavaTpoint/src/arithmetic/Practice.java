package arithmetic;

public class Practice {
	
	int rollno;
	String name, course;
	float fees;
	
	Practice(int rollno, String name, String course){
		this.rollno= rollno;
		this.name= name;
		this.course= course;
	}
	Practice(int rollno, String name, String course,float fees){
		this(rollno,name,course);
		this.fees=fees;
		
	}
	
	void display(){
		System.out.println(rollno+" "+name+" "+course+" "+fees);
	}
	
	public static void main(String[] args){
		Practice p1= new Practice(01, "sekar", "Java");
		Practice p2= new Practice(02,"murali","Angular",2000);
		p1.display();
		p2.display();
		
	}

}
