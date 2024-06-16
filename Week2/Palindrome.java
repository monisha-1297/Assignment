package week2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int input=121;
       int output=0;
       int temp=input;
       while(temp!=0) {
    	   int digit=temp%10;
    	   output=output*10+digit;
    	   temp/=10;
    	   
       }
       
       if(input==output) {
    	   System.out.println(input+" it is a palindrome");
       }else {
    	   System.out.println(input+"is not a palindrome");
       }
	}
       
	}


