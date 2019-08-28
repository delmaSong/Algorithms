import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ1085 {

	/*
	 * 직사각형 내부에 있을때, 
	 * 그 직사각형을 탈출하기 위한 거리의 최솟값 구하기
	 * 지금 위치 (x,y)
	 * 직사각형 왼쪽 아래 꼭짓점(0,0)
	 * 오른쪽 위 꼭짓점(w,h)*/
	public static void main(String[] args) throws IOException{
		
		BOJ1085 bj = new BOJ1085();
		bj.rectangle();
	}

	public void rectangle() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] points = br.readLine().split(" ");

		//입력받은 string 값 integer로 변환해 각 변수에 삽입 
		int x = Integer.parseInt(points[0]);
		int y = Integer.parseInt(points[1]);
		int w = Integer.parseInt(points[2]);
		int h = Integer.parseInt(points[3]);
		
		//현재 위치로부터 직사각형 탈출하기 위한 가로, 세로 변수 선언 
		int garo, sero;
		
		//해당 값 중 짧은 게 garo에 할당 
		if(w-x > x) {
			garo = x;
		}else {
			garo = w-x;
		}
		
		//해당 값 중 짧은 게 sero에 할당 
		if(h-y > y) {
			sero = y;
		}else {
			sero = h-y;
		}
	
		//garo와 sero 중 더 짧은 것 출력 
		if(garo > sero) {
			System.out.println(sero);
		}else {
			System.out.println(garo);
		}
		
	}
	
	
	
	
	
	
}
