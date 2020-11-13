package day4;

public class StringUtil {
    
 
    public static String concatString(String[] strArray) {
    	
    	String res = "";
    	
    		for(int i=0; i<strArray.length; i++) {
    			res += strArray[i];
    			
    		}
			return res;
    	
}


}