package forloop;
import java.util.Scanner;
public class Amstrong {

	public static void main(String[] args) {
		int digit=0 ,num, remander , result=0 , temp;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		temp=num;
		while(num!=0) {
			digit++;
			num=num/10;
			
		}
num=temp;
while(num!=0) {
	remander=num%10;
	result=(int)(result+Math.pow(remander, digit));
	num=num/10;
	
}
if (temp==result) {
	System.out.print("Amstrong number");
}
else {
	System.out.print("not an Amstrong number");
}
s.close();
	}

}
