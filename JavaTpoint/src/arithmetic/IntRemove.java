package arithmetic;

import java.util.Arrays;

public class IntRemove {

	public static void main(String[] args) {
		String[] a = {"as12","efew344","34frgg","4g8bji"};
		
		String[] b = new String[a.length];
		
		for(int i=0; i<a.length; i++){
			b[i] = a[i].replaceAll("[^a-zA-Z]","");
			System.out.println(b[i]);
		}
		System.out.println(Arrays.toString(b));
		//System.out.println(a);

	}

}
