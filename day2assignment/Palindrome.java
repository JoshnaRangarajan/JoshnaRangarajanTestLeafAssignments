package week1.day2assignment;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Input =454;
		int remainder;
		int original;
		original=Input;
		int Output =0;
		
		//Implement a 'for' loop where the control variable ‘i’ starts with the value of the ‘input’ variable
		for(int i= Input; i>0 ; i/=10){
			remainder =Input%10;
			Output=(Output*10)+remainder;	
			Input=Input/10;
		}
			if(original==Output) {
				System.out.println("Number is Palindrome");
			}
				else
				{
					System.out.println("Number is Not Palindrome");
				}
					

	}
	}



	
