package °úÁ¦9;

public class Palindrome {
	public boolean palindrome(String pa) {		
		if(pa.length()<=1) {
				return true;
			}
		else {
			if(pa.charAt(0)==pa.charAt(pa.length()-1)) {			
				String a = pa.substring(1, pa.length()-1);
				return palindrome(a);
				
			}else return false;
		}
	}
}
