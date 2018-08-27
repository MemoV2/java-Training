package basics;

public class Assigment1 {
	public static void main(String[] args) {		
		int[] nums = {916,78,71,154};
		int i = 0;
		int min = 0;
		int max = 0;
		int avg = 0;
		// 0 = 0
		// 1 = 1
		// 2 * 1 = 2 
		// 3 * 2 * 1 = 6
		// 4 * 3 * 2 * 1 = 24
		// 5 * 4 * 3 * 2 * 1 = 120 
		// 6 * 5 * 4 * 3 * 2 * 1 = 720		
		for (int n = 0; n < 7; n++){
			System.out.println(Sumar(n));			
		}		
		System.out.println("the minumum is: " + minimum(nums));
		System.out.println("the average is: " + average(nums));
		System.out.println("the maximum is: " + maximum(nums));

	}
	public static int Sumar(int n){
		int i = 0;
		int j = 0;		
		do{			
			j = (j + i);
			i++;						
		}while (i <= n);
		return j;
	}
	public static int Mult(int n){
		int i = 1;
		int j = 1;
		if(n != 0 ){
			do{			
				j = (j * i);
				i++;						
			}while (i <= n);
			return j;
		}
		else{
			return 0;
		}
	}
	public static int minimum(int min[]){
		int j = min[0];
        for(int i=0; i<min.length;i++){        	
            if(j > min[i]){
            	j = min[i];
            };
        }        
        return j;
	}
	public static int average(int avg[]){
		int j = 0;
        for(int i = 0; i<avg.length;i++){        	
            j = j + avg[i];            
        }
        j = j / (avg.length);
        return j;
	}
	
	public static int maximum(int max[]){
		int j = max[0];
        for(int i=0; i<max.length;i++){        	
            if(j < max[i]){
            	j = max[i];
            };
        }        
        return j;
	}

}
