package basics;

public class FibonnaciApp {

	public static void main(String[] args) {
		//Fibonnaci number is defined by the sum of the 2 previous fibonacci numbers
		//Fib(0)=0
		//Fib(1)=1
		//Fib(2)=Fib(1)+Fib(0)=0+1=1
		//Fib(3)=fib(2)+Fib(1)=1+1=2
		//Fib(4)=fib(3)+fib(2)=2+1=3
		//Fib(5)=fib(4)+fib(3)=3+2=5
		//Fib(6)=fib(5)+fib(4)=5+3=8
		//1! = 1 * 1
		//2! = 2 * 1
		//3! = 3 * 2 * 1
		//4! = 4 * 3 * 2 *1
		//5! = 5 * 4 * 3 * 2 * 1
		
		for (int n = 0; n < 20; n++){
			System.out.println(fib(n));
		}
	}
	public static int fib(int n){
		if(n == 0){
			return 0;
		}
		else if(n == 1){
			return 1;
		}
		return ( (fib(n-1)) + (fib(n-2)) );
	}
}
