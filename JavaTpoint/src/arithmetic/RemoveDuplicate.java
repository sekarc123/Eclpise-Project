package arithmetic;

import java.util.Arrays;

public class RemoveDuplicate {
	
//	public static int removeDuuplicateElements(int arr[],int n)
	

	public static void main(String[] args) {
		
		int arr[] = {0,0,1,2,5,9,9,8,2,3,4,4};
		Arrays.sort(arr);
		int length = arr.length;

		int b[] = new int[length];
		
		for(int i=0; i<length; i++){
			if(i < length-1){
				if(arr[i] != arr[i + 1]){
						System.out.print(arr[i] + ",");
				}
			}
			else {
			System.out.print(arr[i] );
			}
     	  }
		}
}
