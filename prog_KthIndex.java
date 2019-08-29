import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class prog_KthIndex {

	public static void main(String[] args) {

		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		prog_KthIndex prog = new prog_KthIndex();
		prog.solution(array, commands);
	}
	
	  public int[] solution(int[] array, int[][] commands) {
	        
			 List<Integer> listAns = new ArrayList<Integer>();

	        for(int x=0; x<commands.length; x++) {

	        			int i=commands[x][0];
	        			int j=commands[x][1];
	        			int k=commands[x][2];

	        			List<Integer> list = new ArrayList<Integer>();
	        			
	        			 for(int m=i-1; m<=j-1; m++) {
	        				 list.add(array[m]);
	        			 }
	        			 Collections.sort(list);
	        			
	        			listAns.add(list.get(k-1));
	        		
	        }
	        
	        int[] answer = new int[listAns.size()];
	        
	        for(int i=0; i<listAns.size(); i++) {
	        	answer[i] = listAns.get(i);
	        }
	      
	        
	        return answer;
	    }

}
