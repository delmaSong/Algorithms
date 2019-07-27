import java.util.Stack;

public class leetcode844 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String S="ab#c";
		String T="ad#c";
		
		leetcode844 lc = new leetcode844();
		lc.backspaceCompare(S, T);
	}
	
	    public boolean backspaceCompare(String S, String T) {
	    	
	    	boolean answer = false;
	    	
	    	//스트링 항목 쪼개서 배열로 
	    	String[] arr_s = S.split("");
	    	String[] arr_t = T.split("");
	    	
	    	//각각의 스택 생성 
	    	Stack<String> st_s = new Stack<>();
	    	Stack<String> st_t = new Stack<>();
	     
	    	//s의 스택에 배열 s를 차례로 집어넣음
	    	for(int i=0; i<arr_s.length; i++) {
	    		//들어가는 문자열이 # 아닐때 스택에 푸쉬 
	    		if(!arr_s[i].equals("#")) {
	    			st_s.push(arr_s[i]);
	    		}else if(arr_s[i].equals("#") && !st_s.isEmpty()){		//들어가는 문자열이 #일때 
	    			st_s.pop();
	    			
	    		}
	    	}
	    	
	    	//t의 스택에 배열 t를 차례대로 집어넣음
	    	for(int j=0; j<arr_t.length; j++) {
	    		//들어가는 문자열이 #이아닐 때 스택에 푸쉬
	    		if(!arr_t[j].equals("#")) {
	    			st_t.push(arr_t[j]);
	    		}else if(arr_t[j].equals("#") && !st_t.isEmpty()) {
	    			st_t.pop();
	    		}
	    	}
	    	
	    	String ss="";
	    	String tt="";
	    	
	    	while(!st_s.isEmpty()) {
	    		 ss += st_s.pop();
	    	}
	    	
	    	while(!st_t.isEmpty()) {
	    		tt += st_t.pop();
	    	}
	    	
	    	System.out.println("ss is " + ss);
	    	System.out.println("tt is " + tt);
	    	
	    	if(ss.equals(tt)) {
	    		answer = true;
	    		
	    	}
	    	
	    	System.out.println("answer is " + answer);
	    		return answer;
	    }
	

}
