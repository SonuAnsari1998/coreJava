package Exam_27_Sep;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=13;
		Boolean isPrime=false;
		for(int i=1; i<=n/2; i++){
		if(n%i==0){
		isPrime=true;
		}
		
		}
		if(isPrime==true){
			System.out.println(n+" is not a prime number");
			}else{
			System.out.println("+ is prime number");
		}
	}
}
