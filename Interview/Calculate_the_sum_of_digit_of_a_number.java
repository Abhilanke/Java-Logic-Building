package logicBuilding1;

public class Calculate_the_sum_of_digit_of_a_number {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
		int number=12345;
		int sumOfDigits= calculateSumOfDigites(number);
		System.out.println("Sum of digit of "+number +" is: "+sumOfDigits);
		

	}
	

	private static int calculateSumOfDigites(int number) {
		// TODO Auto-generated method stub
		
		
		int sum = 0;
		while(number >0) {
			int digit = number %10;//extract the last digit
			sum = sum+digit;//add the digit to sum
			number =number/10;//remove the last digit from number
		}
		
		return sum;
	}

}
