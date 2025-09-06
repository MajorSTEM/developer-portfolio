//Isaiah Smith
import java.util.Scanner;
public class Math {
	public static void main(String[]args){
		 Scanner input = new Scanner(System.in);
		final double L=0.5;
		double s1,s2,s3,s4,s5;
		System.out.println("Enter your five decimal numebers");
		s1= input.nextDouble();
		s2= input.nextDouble();
		s3= input.nextDouble();
		s4= input.nextDouble();
		s5= input.nextDouble();
		System.out.print("Your numbers are as follows:");
		System.out.println(s1+", "+s2+", "+s3+", "+s4+", "+s5);
		
		int n1=(int)(s1+L);
		int n2=(int)(s2+L);
		int n3=(int)(s3+L);
		int n4=(int)(s4+L);
		int n5=(int)(s5+L);
		
		int sum = n1+n2+n3+n4+n5;
		System.out.println("Sum is:"+sum+ "The average is:" +sum/5);
	}
}