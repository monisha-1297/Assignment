package week2.assignments;

import java.util.Arrays;

public class MissingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a={1,4,3,2,8,6,7};
        Arrays.sort(a);
       
     	for (int i = 0; i < a.length-1; i++) {
     		if( i + 1 != a[i]) {
     			System.out.println("missing elements:" + ( i + 1 ));
     			break;
     			
     		}
     		
     	
     	}	
        
     	}

}
