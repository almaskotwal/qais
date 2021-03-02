
public class revString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str [] = "Do or do not, there is no try.".split(" ");
		
		String words = "";
	
		char[] word= words.toCharArray();
		
		for(int i = str.length-1; i>=0; i--) {
			
			words = words + str[i];
		}
		
		System.out.print(words);



	}
	


}
