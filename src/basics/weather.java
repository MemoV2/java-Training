package basics;

public class weather {
	public static void main (String[] args){
		//da una sugerencia de que vestir en caso del clima (tempertura)
		
		int temperature = 100;
		String Condiciondesol = "Nublado";
		
		if (temperature > 80){
			System.out.println("buen clima, playera y short");
		}
		else if ((temperature > 60) && (Condiciondesol == "Soleado")) {
			System.out.println("esta fresco, ponte playera de manga larga y pantalones");
			System.out.println("ponte una gorra para bloquear el sol");
		}
		else if ((temperature > 50) || (Condiciondesol == "Nublado")){
			System.out.println("dia frio, ponte sueter");
		}
		else{
			System.out.println("deamsiado frio, ponte ropa caliente");
		}
		System.out.println("fin del programa");	
	}

}
