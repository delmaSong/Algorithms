import java.util.Stack;

public class leetcode682 {
	/*
	 * 1. 모든 요소를 스택에 넣을때
	 * 2. 들어가는 요소가 "C" 라면 pop()
	 * 3. 들어가는 요소가 "D" 라면 스택의 맨 윗 요소를 두배 해서 push()
	 * 4. 들어가는 요소가 "+" 라면 스택의 맨 윗 요소와 그 아래 요소를 더해서 push()
	 * 5. 나머지 요소는 Integer로 간주하고 그냥 push()
	 * 6. 배열의 모든 요소가 스택에 들어갔다면 스택에 있는 모든 요소를 더해서 리턴한다
	 * */

	public static void main(String[] args) {

		String[] ops = {"5","-2","4","C","D","9","+","+"};
		
		leetcode682 lc = new leetcode682();
		lc.calPoints(ops);
		
	}
	
	public int calPoints(String[] ops) {
        int sum=0;
        int doubleThing;
        int plus;
        
        
        Stack<Integer> st = new Stack<>();
        
        for(int i=0; i<ops.length; i++) {
        	
        		//들어가는 요소가 "C" 라면 pop()
        		if(ops[i].equals("C")) {
        			st.pop();
    			// 들어가는 요소가 "D" 라면 스택의 맨 윗 요소를 두배 해서 push()
        		}else if(ops[i].equals("D")) {
        			doubleThing = st.peek();
        			st.push(doubleThing);
    			//들어가는 요소가 "+" 라면 스택의 맨 윗 요소와 그 아래 요소를 더해서 push()
        		}else if(ops[i].equals("+")) {
        			plus = st.peek() + st.elementAt(st.size()-2);
        			st.push(plus);
    			//나머지 요소는 Integer로 간주하고 그냥 push()
        		}else {
        			st.push(Integer.parseInt(ops[i]));
        		}
        }
        
        //스택에 있는 모든 값 꺼내서 더하기 
        while(!st.isEmpty()) {
        	sum += st.pop();
        }
        
        return sum;
    }

}
