package Regular_Expresion;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Regular_example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String line = "this order was placed for QT3000! OK?";
		Pattern p=Pattern.compile("(.*?)(\\d+)(.*)");
		Matcher m=p.matcher(line);
		while(m.find())
		{
			System.out.println("group1:"+m.group(1));
			System.out.println("group2:"+m.group(2));
			System.out.println("group3:"+m.group(3));
		}
		

	}

}
