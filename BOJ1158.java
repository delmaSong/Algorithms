import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1158 {

	public static void main(String[] args) throws IOException{

		BOJ1158 bj = new BOJ1158();
		bj.jos();
		
	}
	
	public void jos() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		
       //범위와 타겟을 입력받음 
		int range = Integer.parseInt(line[0]);
		int target = Integer.parseInt(line[1]);

		int cnt = 0;    //타겟번째에 있는 요소 삭제하기 위한 변수
		int quit = 0;   //for문 빠져나오기 위한 변수 
		
		List<Integer> list = new ArrayList<Integer>();
		List<Integer> ans = new ArrayList<Integer>();
		
		//사이즈가 범위만하게 list에 요소 삽입 
		for(int i=1; i<=range; i++) {
			list.add(i);
		}
		
	
        
		for(int i=1; i<=list.size(); i++) {

			if(list.get(i-1) != null) {
				cnt++;
            }

            //cnt와 target의 값이 같을 때 
			if(cnt == target) {
				ans.add(list.get(i-1));     //해당 값 정답 리스트(ans)에 삽입 
				list.remove(i-1);          //그리고 해당 인덱스의 값은 삭제하고
				list.add(i-1, null);       //그 자리에 null을 삽입한다
				cnt = 0;                  //cnt는 0으로 초기화 
				quit++;                   //ans에 값이 삽입될 때마다 quit값 증가
			}
			

            //리스트가 순환하기 위해 i가 list 사이즈와 동일할 때, i를 0으로 초기화 
			if(i == list.size()) {
				i = 0;
			}
			
            //for문 종료하기 위한 조건 
			if(quit == range) {
				break;
			}
		
			
		}
		
        //문제의 출력 형식을 맞추기 위해 
		System.out.print("<");
		for(int i=0; i<ans.size()-1; i++) {
			System.out.print(ans.get(i)+", ");
		}
		System.out.print(ans.get(ans.size()-1)+">");
		
		
	}


}
