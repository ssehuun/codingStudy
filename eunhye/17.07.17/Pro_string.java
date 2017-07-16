import java.util.Scanner;

public class Pro_string {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		String word[] = str.split(" ");
		int cnt=-1;
		
		for(int i=0; i<word.length; i++){
			if(word[i].length()%2 == 0 && word[i].length() > cnt)
				cnt = i;
		}
		
		if(cnt == -1)
			System.out.println("00");
		else
			System.out.println(word[cnt]);
		
		sc.close();
	}

}
