package arithmetic;

public class BitwiseLogicalAndOr {

	public static void main(String[] args) {
		int a=10;
		int b=5;
		int c=15;
		
		int op=(a<b)?a:b;
		System.out.println(op);
		
//		System.out.println(a<b&&a<c);
//		System.out.println(a<b&&++b<c);
//		System.out.println(a<b&++a<c);
//		System.out.println(a<b&a<c);
//		System.out.println(a);
//		System.out.println(b);
		
//		System.out.println(a<b||a<c);
//		System.out.println(a>b||a<c);
//		System.out.println(a<b||b>c);
//		System.out.println(a<b||++a<c);
//		System.out.println(a);
//		System.out.println(a<b|a<c);
//		System.out.println(a<b|a>c);
//		System.out.println(a<b|++a<c);
//		System.out.println(a);
//		
	
		 int marks=65;  
	      
		    if(marks<50){  
		        System.out.println("fail");  
		    }  
		    else if(marks>=50 && marks<60){  
		        System.out.println("D grade");  
		    }  
		    else if(marks>=60 && marks<70){  
		    	
		        System.out.println("C grade");  
		    }  
		    else if(marks>=70 && marks<80){  
		        System.out.println("B grade");  
		    }  
		    else if(marks>=80 && marks<90){  
		        System.out.println("A grade");  
		    }else if(marks>=90 && marks<100){  
		        System.out.println("A+ grade");  
		    }else{  
		        System.out.println("Invalid!");  
		    }  
		
		
	}

}
