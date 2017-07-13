package codingStudy;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2;
		Scanner scan= new Scanner(System.in);
		
		s1 = scan.nextInt();
		s2 = scan.nextInt();
		s1 = reverse(s1);
		s2 = reverse(s2);
		if(s1>s2) System.out.println(s1);
		else System.out.println(s2);
	}
	public static int reverse(int num){
		int ret=0;
		
		while(num>0){
			ret*=10;
			double temp = num%10;
			num/=10;
			
			ret += temp;
		}
		return ret;
	}

}
