package Mcq;

public class NS {
	
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		for( i=0;i<=10;i++) {
			if(i%3==0){
				System.out.println("N");
			}
			else if(i%5==0) {
				System.out.println("S");
			}
			else if(i%3==0 && i%5==0) {
				System.out.println("ns");
				
				
			}
			
		}
		System.out.println("i="+i);

	}

}

