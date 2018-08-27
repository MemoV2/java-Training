package basics;

public class Lab1 {

	public static void main(String[] args) {
		System.out.println(sum(4));
		System.out.println(fact(5));		
		int [] numbers = {5,2,-895,7,89,-2};
		System.out.println("minimum is: "+findMin(numbers));
		System.out.println("maximum is: "+findMax(numbers));
		System.out.println("Average is: "+findAvg(numbers));
		
	}
	public static int findMin(int[] arr){
		int min = arr[0];
		for (int i = 0; i< arr.length;i++){
			if(arr[i] < min){
				min = arr[i];
			}
		}
		return min;
	
	}
	public static int findMax(int[] arr){
		int max = arr[0];
		for (int i = 0; i< arr.length;i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}
		return max;
	
	}
	public static int findAvg(int[] arr){
		int max = arr[0];
		int sum = 0;
		for (int i = 0; i< arr.length;i++){
			sum = sum + arr[i];
		}
		return sum/arr.length;
	
	}
	public static int sum(int n){
		int sum = 0;
		for(int i = 1 ; i <= n;i++ ){
			sum = sum + i;
		}
		return sum;
	}
	public static int fact(int n){
		if(n==0){
			return 1;
		}
		else{
			return fact(n-1) * n;
		}
	}
}


