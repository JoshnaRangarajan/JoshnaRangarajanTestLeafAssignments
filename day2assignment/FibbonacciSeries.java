package week1.day2assignment;

public class FibbonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maxNumber= 8;
		int previousNumber = 0;
		int nextNumber = 1; 
		for (int i= 1; i<= maxNumber;++i) {
			System.out.println(previousNumber+" ");
			int sum= previousNumber+ nextNumber;
			previousNumber= nextNumber;
			nextNumber=sum;
		}
		

	}

}
