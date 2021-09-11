package conversion_of_i_to_f_and_f_to_d;

import java.util.Scanner;

public class conversion_of_i_to_f_and_f_to_d {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter number :");
		
		int n= sc.nextInt();
        long l=n;
	    float f=l;
	    System.out.print("The long value is :"+l+"\n");
	    System.out.print("The float value is :"+f);
		

	}

}
