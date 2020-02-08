
public class FirstNonReapeatingChar {

	
	public static void firstNonRepeatingChar(String str) {
		
		char[] charArray = str.toCharArray();
		char c = charArray[0];
		for(int i=0; i<charArray.length; i++) {
			if(c != charArray[i])
				break;
		}
		System.out.println("first non-repeating char from string is: "+c);
	}
	public static void main(String[] args) {
		FirstNonReapeatingChar.firstNonRepeatingChar("aabbrbbbddd");

	}

}
