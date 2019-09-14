
public class leetcode771 {
	public static void main(String[] args) {
	
		String J = "aA";
		String S = "aAAbbbb";
		
		leetcode771 lc = new leetcode771();
		lc.numJewelsInStones(J, S);
	}
	public int numJewelsInStones(String J, String S) {
        int cnt = 0;
        
        String[] jj = J.split("");
        String[] ss = S.split("");
        
        for(int i=0; i<ss.length; i++) {
        		for(int j=0; j<jj.length; j++) {
        			if(ss[i].equals(jj[j])) {
        				cnt++;
        			}
        		}
        }
        return cnt;
    }
}
