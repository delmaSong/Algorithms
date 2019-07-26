import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class BOJ_10799 {
	//입력받은 괄호들을 전부 배열에 넣는다
	
		//배열에 있는 모든 항목들을 꺼내며 검사
		//( 괄호 뒤 곧바로 )가 나오면 레이저로 간주, (의 인덱스를 레이저 배열에 저장
		//그게 아니면 (괄호의 인덱스 가지고 있다가 )괄호 만나면 )인덱스 - (인덱스 = 쇠막대기 길이 로 쇠막대기 배열에 저장
		//각각의 쇠막대기에 레이저가 몇번 지나가는지 검사. 레이저 갯수 +1값이 쇠조각 갯수 ..
		
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//괄호 배치 입력받음 
		String garo = sc.nextLine();
		
		//스트링 항목 쪼개서 배열로
		String[] garos = garo.split("");
		
		BOJ_10799 bj = new BOJ_10799();
		bj.find(garos);
		
		
	}

	
	
	public int find(String[] garos) {

				
		String Ogaro = "(";
		String Cgaro = ")";
		
		int metalCnt=0;
		int lazerCnt =0; 
		int answer = 0;
		
		//레이저 인덱스 저장할 리스트 
		ArrayList<Integer> lazers = new ArrayList<Integer>();
		
		//쇠막대 시작점과 길이 저장할 맵
		Map<Integer, Integer> map_metal = new HashMap<Integer, Integer>();
		
		//(괄호 인덱스 저장할 스택 
		Stack<Integer> st_start = new Stack<>();
		
	
		
		for(int i=0; i<garos.length; i++) {
		
			//Ogaro가 올 때 (
			if(i != garos.length-1) {              //i가 맨 마지막일때는 실행하지 않음. i+1까지 훑어야 하므로 
			
				//( 다음 ) 올때
				if(garos[i].equals(Ogaro) && garos[i+1].equals(Cgaro)) {
					//레이저이므로 i를 레이저 인덱스에 삽입
					lazers.add(i);
					System.out.println("레이저에 애드 " + i);
				}
				
				//(다음 ( 올때 
				if(garos[i].equals(Ogaro) && garos[i+1].equals(Ogaro)) {
					//쇠막대 시작 지점이므로 쇠막대 스택에 push
					st_start.push(i);
					System.out.println("쇠막대시작점. 스택에 들어간다   " + i);

				}
				
			
			}
			
			
			//Cgaro가 올 때 }
			if(i != 0) {             //i가 0일때는 실행하지않음. i-1도 훑어야 하므
				System.out.println(") 올때 ");
				// ) 다음 ) 올때 
				if(garos[i-1].equals(Cgaro) && garos[i].equals(Cgaro)) {
					//쇠막대 닫는 괄호이므로 쇠막대 스택에 저장된거 꺼내서 길이 계산 후 맵에 키(시작점), 밸류(끝점) 로 put 
					
					map_metal.put(st_start.peek(), i);
					
					System.out.println("쇠막대길이나왔음. 닫는 인덱스  " + i);
					st_start.pop();
				}
				
				// ( 다음 ) 올때 
				if(garos[i-1].equals(Ogaro) && garos[i].equals(Cgaro)) {
					System.out.println("앞에서 걸렀으니 패스  ");

				}
			}
			
		}
		
		Set<Integer> key = map_metal.keySet();
		//쇠막대 시작 키값 돌아 
		for(Iterator<Integer> iterator = key.iterator(); iterator.hasNext();) {
			int metal_start = iterator.next();
			int metal_end = map_metal.get(metal_start);
			
			metalCnt += 1;
			//레이저 어디어디 있는지 돌아 
			for(int i=0; i<lazers.size(); i++) {
				//레이저가 쇠막대 사이에 있을 때 
				if(metal_start < lazers.get(i) && lazers.get(i) <metal_end) {
					lazerCnt += 1;
					System.out.println(lazers.get(i) + " 번 레이저가 통과하는 갯수 " + lazerCnt);
					
				}
			}
			
		}
		
		System.out.println("답은,,,," + (lazerCnt+metalCnt));
		answer = lazerCnt+metalCnt;
		return answer;
	}

	
}
