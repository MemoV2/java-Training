package basics;

public class NumerosCalc {
	public static void main(String[] args){
		System.out.println("El programa inicio");
		printname();
		int numA = 10;
		int numB = 20;			
		addnumbers(numA, numB);
		int producto =  multiplynumbers(numA, numB);
		//System.out.println("la multiplicacion de "+ numA + " por " + numB + " es igual a " + multiplynumbers(numA, numB));
		System.out.println(producto);
	}
	static void printname(){
		System.out.println("Nombre: Memo");
	}
	
	static void addnumbers(int numeroA, int numeroB){
	//esta funcion agrega numeros
		int sum = numeroA + numeroB;
		System.out.println("la suma de "+ numeroA + " mas " + numeroB + " es igual a: " + sum);
	}
	
	static int multiplynumbers(int valorA, int valorB){
		int producto = valorA * valorB;
		addnumbers(producto + 50, producto);
		return producto;
	}
	
}
