package arithmetic;

public class PrimeNumber {

	public static void main(String[] args) {

		int i, m=0, a=0;
		
		int n = 7;
		
		m=n/2;
		
		if(n==0 || n==1){
			System.out.println(n + " Is Not Prime No.");
		}
		else {
			for(i=2; i<=m;i++){
				if(n%i==0){
					System.out.println(n + " Is Not Prime No.");
					a=1;
					break;
				}
			}
			if(a==0){
				System.out.println(n + " Is Prime No.");
			}
		}
		

	}

}
