package seleniumBasics;

public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int [][] myNum= {{1,2,3,4},{5,6,7}};
		//myNum[1][2]=9;
		//System.out.println(myNum[1][2]);
		for(int i=0;i<myNum.length;++i )
		{
			for(int j=0;j<myNum[i].length;++j)
			{
				System.out.println(myNum[i][j]);
			}
		}
	}

}
