package arithmetic;

public class Armstrong {

	public static void main(String[] args) {
		int c=0, temp;
		
		int n=154;
		
		temp= n;
		while(n>0){
			int a = n%10;
			 n = n/10;
			c=c+(a*a*a);
		}
		if(temp==c){
			System.out.println("armstrong");
		}
		else{
			System.out.println("not arm");
		}

	}

}
