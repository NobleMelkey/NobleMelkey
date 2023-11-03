package Data_structure;

public class GoTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:
			for(int i=1;1<=5;i++)
			{
				inner:
					for(int j=1;j<=5;j++)
					{
						if(i==j)
						{
							System.out.println("outer loop");
							continue outer;
						}
						else {
							System.out.println("inner loop");
							continue inner;
						}
					}
			}

	}

}
