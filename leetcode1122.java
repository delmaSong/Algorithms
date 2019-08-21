import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class leetcode1122 {

	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		
		leetcode1122 lc = new leetcode1122();
		lc.relativeSortArray(arr1, arr2);
	}

	public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        List<Integer> ansList = new ArrayList<Integer>();
        List<Integer> arr1List = new ArrayList<Integer>();
        
       
        //배열 arr1을 역순으로 리스트로 변경 
        for(int i=(arr1.length-1); i>=0; i--) {
        		arr1List.add(arr1[i]);
        }
        
        
        //arr2 배열을 돌면서 
        for(int i=0; i<arr2.length; i++) {
        		//arr1 리스트를 조회하는데 
        		for(int j=0; j<arr1List.size(); j++) {
        			//두개가 같을 때 
        			if(arr2[i] == arr1List.get(j)) {
        				//정답 리스트에 삽입하고 
        				ansList.add(arr1List.get(j));
        				arr1List.remove(j);		//해당항목을 삭제한다 
        				Collections.reverse(arr1List);		//바로 옆에꺼 건너뛰는걸 방지하기 위해 역순으로 정렬 
        			}
        		}
        }

        //남아있는 것들 오름차순으로 정렬 
        Collections.sort(arr1List);
        
        //순서대로 정답리스트에 삽입 
        for(int i=0; i<arr1List.size(); i++) {
        		ansList.add(arr1List.get(i));
        }
        
        int[] answer = new int[ansList.size()];
        
        for(int i=0; i<ansList.size(); i++) {
    			answer[i] = ansList.get(i);
        }

       
        
        return answer;
		
		

    }
}
