package basics;
public class Ciudades {
	public static void main(String[] args) {
		//Declara y definir un Arreglo (Array)
		String[] Ciudades = {"gdl","df","monterrey","leon"};
		System.out.println(Ciudades[0]);
		System.out.println(Ciudades[1]);
		System.out.println(Ciudades[2]);
		System.out.println(Ciudades[3]);

		//Declarar el Array
		String[] paises;
		//Definir el Array
		paises = new String[3];
		paises[0] = "MX";
		paises[1] = "US";
		paises[2] = "CAN";
		System.out.println(paises[1]);
		
		//declarar y definir el array (solo el tamaño)
		System.out.println("********************************");
		String[] Estados = new String[5];		
		Estados[0] = "Jalisco";
		Estados[1] = "Mich";
		Estados[2] = "Naya";
		Estados[3] = "Sono";
		Estados[4] = "Chih";
		int i = 0;
		//el do loop entra al loop, y prueba la condicion
		do{
			System.out.println("Estado: " + Estados[i]);
			i++;
		} while (i <5 ); 
		
		//while loop: primero prueba la condicion, y luego entra al loop
		int n = 0;
		boolean Estadoencontrado = false;
		while(!Estadoencontrado){
			String Estado = Estados[n];
			System.out.println(Estado);
			if(Estado == "Naya"){
				System.out.println("Estado encontrado");
				Estadoencontrado = true;
			}
			n++;
		}
		System.out.println("\nPrinting con For");
		//For loop la mejor estructura para iterara traves de un array
		for (int x = 0; x < 5; x++){
			System.out.println(Estados[x]);
		}
		
		//declarar y definir el array (solo el tamaño)
		/*String[] Estados = new String[5];
		int i;
		Estados[0] = "Jalisco";
		Estados[1] = "Mich";
		Estados[2] = "Naya";
		Estados[3] = "Sono";
		System.out.println(Estados[0]);
		*/
	}

}
