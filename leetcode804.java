import java.util.ArrayList;
import java.util.List;

public class leetcode804 {

	public static void main(String[] args) {

		String[] words = {"cbrl", "cdfl", "wvtj", "wvkm", "anuyt"};
		
		leetcode804 lc = new leetcode804();
		lc.uniqueMorseRepresentations(words);
	}
    public int uniqueMorseRepresentations(String[] words) {
        String[] tmp;
        String tt = "";
        List<String> list =new ArrayList<String>();
        List<String> list2 =new ArrayList<String>();
        
        for(int i=0; i<words.length; i++) {
        		tmp = words[i].split("");
        		tt = "";
        		for(int j=0; j<tmp.length; j++) {
        			 tt += morse(tmp[j]);
        		}
        		list.add(tt);
        }
        
        //중복 제거 위한 for문 
       for(int i=0; i<list.size(); i++) {
    	   	if(!list2.contains(list.get(i))) {
    	   		list2.add(list.get(i));
    	   	}
       }
        
        return list2.size();
    }
    
    public String morse(String wd) {
    		if(wd.equals("a")) {
    			wd = ".-";
    			return wd;
    		}else if(wd.equals("b")) {
    			wd = "-...";
    			return wd;
    		}else if(wd.equals("c")) {
    			wd = "-.-.";
    			return wd;
    		}else if(wd.equals("d")) {
    			wd = "-..";
    			return wd;
    		}else if(wd.equals("e")) {
    			wd = ".";
    			return wd;
    		}else if(wd.equals("f")) {
    			wd = "..-.";
    			return wd;
    		}else if(wd.equals("g")) {
    			wd = "--.";
    			return wd;
    		}else if(wd.equals("h")) {
    			wd = "....";
    			return wd;
    		}else if(wd.equals("i")) {
    			wd = "..";
    			return wd;
    		}else if(wd.equals("j")) {
    			wd = ".---";
    			return wd;
    		}else if(wd.equals("k")) {
    			wd = "-.-";
    			return wd;
    		}else if(wd.equals("l")) {
    			wd = ".-..";
    			return wd;
    		}else if(wd.equals("m")) {
    			wd = "--";
    			return wd;
    		}else if(wd.equals("n")) {
    			wd = "-.";
    			return wd;
    		}else if(wd.equals("o")) {
    			wd = "---";
    			return wd;
    		}else if(wd.equals("p")) {
    			wd = ".--.";
    			return wd;
    		}else if(wd.equals("q")) {
    			wd = "--.-";
    			return wd;
    		}else if(wd.equals("r")) {
    			wd = ".-.";
    			return wd;
    		}else if(wd.equals("s")) {
    			wd = "...";
    			return wd;
    		}else if(wd.equals("t")) {
    			wd = "-";
    			return wd;
    		}else if(wd.equals("u")) {
    			wd = "..-";
    			return wd;
    		}else if(wd.equals("v")) {
    			wd = "...-";
    			return wd;
    		}else if(wd.equals("w")) {
    			wd = ".--";
    			return wd;
    		}else if(wd.equals("x")) {
    			wd = "-..-";
    			return wd;
    		}else if(wd.equals("y")) {
    			wd = "-.--";
    			return wd;
    		}else{
    			wd = "--..";
    			return wd;
    		}
    }
}
