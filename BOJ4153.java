import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
 * 입력받은 세 값으로 
 * 직각삼각형을 만들 수 있는지 여부를 출력하라 */
public class BOJ4153 {
	public static void main(String[] args) throws IOException{

		BOJ4153 bj = new BOJ4153();
		bj.tri();
		
	}
	
	public void tri() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			//삼각형의 세 변 입력받음 
			String[] sides = br.readLine().split(" ");
			
			
			//모든 값이 0 일때, while문 종료 
			if(sides[0].equals("0") && sides[1].equals("0") && sides[2].equals("0")) {
				break;
			}
			
			
			//각 변수에 입력받은 값 할당 
			int a = Integer.parseInt(sides[0]);
			int b = Integer.parseInt(sides[1]);
			int c = Integer.parseInt(sides[2]);
			
			
			//제일 큰 값을 기준으로 피타고라스의 정리를 만족하는 수식을 만듦 
			if(a >= b && a >= c) {
				if( Math.pow(a, 2) == Math.pow(b, 2) + Math.pow(c, 2)) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}else if(b >= a && b >= c) {
				if( Math.pow(b, 2) == Math.pow(a, 2) + Math.pow(c, 2)) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}else if(c >= a && c >= b) {
				if( Math.pow(c, 2) == Math.pow(b, 2) + Math.pow(a, 2)) {
					System.out.println("right");
				}else {
					System.out.println("wrong");
				}
			}
		}
		
	}

}
