import java.util.*;
public class Pro_1759 {
	public static String alpha[];
	
	public static boolean check(String s,int l){
		int ja = 0, mo = 0;
		
		for(int i=0; i<l; i++){
			char temp = s.charAt(i);
			if(temp == 'a' ||temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u')
				mo++;
			else
				ja++;
		}
		return ja >= 2 && mo >= 1;
	}
	
	public static void password(int l, int index, String result){
		if(result.length() == l){
			if(check(result,l)){
				System.out.println(result);//길이가 완성되면 모음,자음 개수 확인 후 출력
			}
			return;
		}
		
		if(index >= alpha.length) return;
		password(l, index+1, result+alpha[index]);
		password(l, index+1, result);		
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		
		sc.nextLine();
		alpha = sc.nextLine().split(" ");
		
		Arrays.sort(alpha);
		
		password(l,0,"");
		
		sc.close();
	}
}
