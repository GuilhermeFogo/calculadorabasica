package calculadora_ok;

import java.util.Scanner;

import Calculo.calculadora;

public class principal {
	
	private static String verifica;
	
	public static void main(String[] args) throws IllegalArgumentException {
		calculadora cal = new calculadora();
		double campo1;
		double campo2;
		long campo;
		Scanner in = new Scanner(System.in);
		boolean continuar = true;
		
		while (continuar== true) {
			System.out.println("Qual a sua operação");
			System.out.println("+ || - || * || /  || R- Raiz ||F- fatorial || L-logaritimo na base 10 ||  0- Sair");
				verifica = in.next();
			switch (verifica) {
			case "+":
				
				System.out.println("Digite um numero");
				campo1 = in.nextDouble();
				
				System.out.println("Digite outro numero");
				campo2 = in.nextDouble();
				
				System.out.println("O resiltado da soma é "+cal.somar(campo1, campo2, "+"));
				break;
				
			case "-":
				System.out.println("Digite um numero");
				campo1 = in.nextDouble();
				
				System.out.println("Digite outro numero");
				campo2 = in.nextDouble();
				
				System.out.println("O resultado da subtração é "+ cal.subtarir(campo1, campo2, "-"));
				break;
				
			case "*":
				System.out.println("Digite um numero");
				campo1 = in.nextDouble();
				
				System.out.println("Digite outro numero");
				campo2 = in.nextDouble();
				
				System.out.println("O resultado da subtração é "+ cal.multiplicar(campo1, campo2, "*"));
				
				break;
			case "/":
				System.out.println("Digite um numero");
				campo1 = in.nextDouble();
				
				System.out.println("Digite outro numero");
				campo2 = in.nextDouble();
				
				System.out.println("O resultado da subtração é "+ cal.multiplicar(campo1, campo2, "/"));

				break;
				
				// Raiz
			case"R":
				System.out.println("Digite um numero");
				campo1 = in.nextDouble();
				
				System.out.println("O resultado da Raiz quadrada é "+ cal.raiz_2(campo1));				
				break;
				
			case "r":
				System.out.println("Digite um numero");
				campo1 = in.nextDouble();
				
				System.out.println("O resultado da Raiz quadrada é "+ cal.raiz_2(campo1));
				 break;
				 
				 // Fatorial
				 
			case "F":
				System.out.println("Digite um numero");
					campo = in.nextLong();
				cal.Fatorial(campo);
				break;
				 
			case "f":
				System.out.println("Digite um numero");
					campo = in.nextLong();
					cal.Fatorial(campo);
				break;
				
				// logarimo
			case "L":
				System.out.println("Digite um numero");
				campo = in.nextLong();
				System.out.print("O logaritimo de "+ campo+" é:");
				System.out.println(cal.logaritimo_10(campo));
				break;
				
			case "l":
				System.out.println("Digite um numero");
				campo = in.nextLong();
				System.out.print("O logaritimo de "+ campo+" é:");
				System.out.println(cal.logaritimo_10(campo));
				break;
				
				// sair
				
			case "0":
				continuar= false;
				System.out.println("Deligando...");
				System.exit(0);
				break;
			default:
				System.out.println("Erro");
				break;
			}
		}
	}
}