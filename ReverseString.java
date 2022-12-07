import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a string value: ");
	      String input = sc.nextLine();
	      if(input.length()<=30 &&  input.matches("\\A\\p{ASCII}*\\z")) {
	    	  
	         System.out.println("String approved and length is less than 30");
	         StringBuffer sb=new StringBuffer(input);
	         System.out.println("Reverse of string is : " + sb.reverse());
	      } else {
	         System.out.println("Contains non-ASCII values or string length is greatherthan 30");
	      }
	      
	      
	}
	 
	      
	}


