package week1.day2assignment;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int n=1223;
	boolean IsPrime =true;
	for(int i=2 ; i<n; i++) {
		int remainder = n%i ;
		
		if (remainder ==0) {
			IsPrime =false;
			System.out.println("Number is Not Prime");
			break;
		}
			
		}
	if(IsPrime==true) {
		System.out.println("Number is Prime");
	}
	
		
	}
	}
			
		
				




