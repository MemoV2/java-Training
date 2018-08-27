package basics;
import java.io.*;
public class Strings {

	public static void main(String[] args) {
		String titulodelibro;
		String Palabraelegida = "anillos";
		titulodelibro = "el señor de los anillos";
		
		if (titulodelibro.contains(Palabraelegida)){
			System.out.println("el libro contiene la palabra " + Palabraelegida);
		}
		String Browser = "Chrome";
		if (Browser.equalsIgnoreCase("chrome")){
			System.out.println("Si contiene la palabra");
		}
		String PrimerNombre = "Guillermo";
		String Apellido = "Renteria";
		String NSS = "456123741";
		
		//imprimir las iniciales mas los ultimos 4 del nss
		System.out.print(PrimerNombre.substring(0,1));
		System.out.print(Apellido.substring(0,1));
		System.out.println(NSS.substring(NSS.length()-4));
	}

}
