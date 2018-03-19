package coursera;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matching {
	 
	static String str="AAAATTTTGGGTATGTAGGTATAA";
	public static void main(String[] args) {
		int b = 0;
		System.out.println("String to be matched:ATG");
		//System.out.println(str.matches("(.*)ATG(.*)"));
		System.out.println(str.contains("ATG"));
		int a= str.indexOf("ATG");
		System.out.println(a);
		String st;
		System.out.println(st=str.substring(str.indexOf("ATG")+3));
		if(st.matches("(.*)TAA(.*)")){
			System.out.println(str.indexOf("TAA"));
			 b=str.indexOf("TAA");}
			else {
				System.out.println("False");
			}
		
		
	/*	String regex="(.*)ATG(.*)TAA(.*)";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(str);
		if(matcher.matches())
		{
		 System.out.println(matcher.group(2));	
		}
*/		
 
        if((b-(a+2))%3==0) {
        	System.out.println(str.substring(a,b+4));
        	
        }
        
        else {
        	System.out.println("Not divisible by 3");
        }
	}
}


