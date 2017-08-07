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
			int z = now.indexOf('9'); //0�� ��ġã��
			int x = z/3; //�迭������ row��ġ
			int y = z%3; //�迭������ col��ġ
			
			for(int i=0; i<4; i++){
				int nx = x + dx[i];
				int ny = y + dy[i];
				if(nx >= 0 && nx < 3 && ny >= 0 && ny < 3){
					StringBuilder next = new StringBuilder(now);
					char temp = next.charAt(x*3+y);
					next.setCharAt(x*3+y, next.charAt(nx*3+ny));
					next.setCharAt(nx*3+ny, temp); //���񿡼��� �ڸ� swap
					
					int num = Integer.parseInt(next.toString());//���� string�� ������ ��ȯ
					if(!m.containsKey(num)){
						m.put(num, m.get(cur)+1);
						q.add(num);						
					} //map�� ���ԵǾ� ���� ������ �ִ´�
					
				}
			}
		}
		if(m.containsKey(123456789))
			System.out.println(m.get(123456789));
		else
			System.out.println("-1");
	}

}
