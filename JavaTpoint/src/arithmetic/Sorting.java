package arithmetic;

import java.util.Arrays;

public class Sorting {
	
	public static void main(String[] arr){
  
	int  a[]= {1,0,2,3,4,5,4,3,2,1,6};
	Arrays.sort(a);
   
    System.out.println(Arrays.toString(a));
    //for highest 3 numbers
    for(int i=a.length-3; i<a.length; i++){
    
    System.out.println(a[i]);
    }
    
    //for lowest 3 numbers
    for(int j=0; j<3; j++){
    	System.out.print(a[j] + ",");
    }
       
	
	}
}


