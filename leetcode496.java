import java.util.ArrayList;

public class leetcode496 {
	/*
	1.nums1[]을 돌면서
	2.nums2[]에서 동일한 요소를 찾고
	3.그 오른쪽 요소가 지금 요소보다 작으면
	4.그 다음 오른쪽으로 이동하는 식으로 nums2[]의 배열 끝까지 이동
	5.else 그 오른쪽 요소가 크면 리턴할 배열에 삽입한다
	*/

	public static void main(String[] args) {

		int[] nums1 = {4,1,2};
		int[] nums2 = {1,3,4,2};
		
		leetcode496 lc = new leetcode496();
		lc.nextGreaterElement(nums1, nums2);
	}
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        ArrayList<Integer> list = new ArrayList<>();
       
        int target;    //찾고자 하는 값을 타겟에 저장하기 위해 선언
        
        
        for(int i=0; i<nums1.length; i++) {
        		target = nums1[i];
        		int j=0;
        		
        		//nums2[] 에서 타겟 위치 찾기 
        		while(nums2[j] !=target) {
        			j++;
        		}
        		

        		while(j !=(nums2.length-1)) {
        			//해당 값이 타겟값보다 클때 해당 값을 리스트에 추가한다 
        			if(j != (nums2.length-1) && nums2[j+1] > target) {
        				list.add(nums2[j+1]);
        				break;
        			}else if(j != (nums2.length-1) && nums2[j+1] < target) {     //해당 값이 타겟값보다 작으면 j의 값을 증가시켜 nums2[]을 탐색하게 한다 
        				j++;
        			
        			}
        		}
        		
        		//j가 nums2[]의 끝까지 갔다면 찾는 요소가 없다는 뜻이므로 -1을 삽입한다 
        		if(j == nums2.length-1){
    				list.add(-1);
    			}

        }
        
        //리스트 사이즈 크기의 배열을 생성 
        int[] answer = new int[list.size()];
        
        //리스트의 요소를 해당 배열에 넣어준다 
        for(int i=0; i<answer.length; i++) {
        		answer[i] = list.get(i).intValue();
        }
        
        return answer;
    }


}
