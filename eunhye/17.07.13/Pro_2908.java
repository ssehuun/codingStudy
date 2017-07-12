import java.util.Scanner;

public class Pro_2908 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String num1, num2;
		
		num1 = sc.next();
		num2 = sc.next();		
		
		for(int i=2; i >= 0;){
			if(num1.charAt(i) > num2.charAt(i))	{
				for(int j=2; j>=0; j--)
					System.out.print(num1.charAt(j));				
				break;
				}
			else if(num1.charAt(i) < num2.charAt(i)){
				for(int j=2; j>=0; j--)
					System.out.print(num2.charAt(j));	
				break;				
			}
			else 
				i--;
		}		
		sc.close();

	}

}
