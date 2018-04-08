package arithmetic;

public class Factorial {

	public static void main(String[] args) {
		
	int n, fact=1;
	n=4;
	for(int i=1; i<=n; i++){
		fact = fact*i;
		System.out.println(fact);
	}
	   
	  System.out.println("Factorial of "+n+" is: "+fact);
	
		
			        
//		        String str= "121";
//		        String reverse = "";
//		        
//		        
//		        for(int i = str.length() - 1; i >= 0; i--)
//		        {
//		            reverse = reverse + str.charAt(i);
//		        }
//		        
//		        System.out.println("Reversed string is:");
//		        System.out.println(str.equals(reverse));
//			
//	
//		   if (str.equals(reverse)){
//			   
//			   System.out.println("yes");
//		   }
//		   else{
//			   System.out.println("no");
//		   }

	}
}
