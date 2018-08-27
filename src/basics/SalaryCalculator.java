package basics;

public class SalaryCalculator {
	public static void main(String[] args){
		//crear variable que defina la carrera
		
		//declarar variable
		String Carrera;
		System.out.println("el programa esta inciando");
		//definir variable (darle un valor valor)
		Carrera = "desarrollador de java";
		System.out.println("Mi carrera es: " + Carrera);
		
		//declarar y definir variable
		int HoursPerWeek = 40;
		int WeeksPerYear = 50;
		Double rate = 42.50;
		Double Salary = HoursPerWeek * WeeksPerYear * rate;
		System.out.println("Mi salario es como " + Carrera+ " es: $" + Salary + " Por Año");
		//calcular salario anual
		
		//rate*hoursperweek*weeksperyear
		
	}
}
