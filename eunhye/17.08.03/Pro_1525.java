import java.util.*;

public class Pro_1525 {
	public static int dx[] = {0,0,1,-1};
	public static int dy[] = {1,-1,0,0};
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int start = 0;
		
		Queue<Integer> q = new LinkedList<Integer>();
		HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();
		
		for(int i=0; i<9; i++){			
				int temp = sc.nextInt();
				if(temp == 0)
					temp = 9;
				start = start*10 + temp;
		}
		
		m.put(start, 0);
		q.add(start);
		
		while(!q.isEmpty()){
			int cur = q.remove();
			String now = Integer.toString(cur);
			int z = now.indexOf('9'); //0의 위치찾음
			int x = z/3; //배열에서의 row위치
			int y = z%3; //배열에서의 col위치
			
			for(int i=0; i<4; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx >= 0 && nx < 3 && ny >= 0 && ny < 3){
					StringBuilder next = new StringBuilder(now);
					char temp = next.charAt(x*3+y);
					next.setCharAt(x*3+y, next.charAt(nx*3+ny));
					next.setCharAt(nx*3+ny, temp); //퍼즐에서의 자리 swap
					
					int num = Integer.parseInt(next.toString());//다음 string을 정수로 변환
					if(!m.containsKey(num)){
						m.put(num, m.get(cur)+1);
						q.add(num);						
					} //map에 포함되어 있지 않으면 넣는다
					
				}
			}
		}
		if(m.containsKey(123456789))
			System.out.println(m.get(123456789));
		else
			System.out.println("-1");
	}

}
