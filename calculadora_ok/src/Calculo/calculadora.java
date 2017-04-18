package Calculo;


import java.util.InputMismatchException;
public class calculadora {
	private double numero1;
	private double numero2;
	private String operador;
	private long fatorial;
	
	// GET E SETs
	public void setOperador(String operador) {
		this.operador = operador;
	}
	
	public long getFatorial() {
		return fatorial;
	}
	
	public void setFatorial(long fatorial) {
		this.fatorial = fatorial;
	}
	
	// contrutor
	public calculadora() {
	
	}
	
	// contrutor
	public calculadora(double num1, double num2) {
		this.numero1= num1;
		this.numero2= num2;
	}
	
		// Somar
	public double somar(double num1, double num2, String operador_mais) throws InputMismatchException{
		setOperador(operador_mais);
		if (operador_mais == "+") {
			return num1 +num2;
		}else {
			return num1 - num2;
		}
	}
		// subtarir
	public double subtarir(double num1, double num2, String operador_menos) throws InputMismatchException{
		setOperador(operador_menos);
		if (operador_menos == "-") {
			return num1 - num2;
		}else {
			return num1 + num2;
		}
	}
	
		// multiplicar
	public double multiplicar(double num1, double num2, String operador_multiplicar) throws InputMismatchException{
		setOperador(operador_multiplicar);
		if (operador_multiplicar == "*") {
			return num1 *num2;
		}else {
			return num1 / num2;
		}
	}
		// dividir
	public double dividir(double num1, double num2 , String operador_divi) throws InputMismatchException{
		setOperador(operador_divi);
		if (operador_divi== "/") {
			return num1 / num2;
		}else {
			return num1 * num2;
		}
	}
		// raiz quadrada
	public double raiz_2(double num) throws InputMismatchException{
		return Math.sqrt(num);
	}
	
	public double Fatorial(long numero) throws InputMismatchException{
		setFatorial(numero);
		numero =1;
		for (int i = 1; i <= getFatorial(); i++) {
			
			if(this.fatorial <= 0){
				System.out.println("Não foi possivel fazer o calculo , tente novamente");
			}else{
				numero = numero * i; 
                //1 = 1*1;
                // imprimir 1=1
                //1= 1*2
                //imprimir 2=2
                // 2 = 2*3
                //  imprimir 2=6
           System.out.println("Fatorial de "+i+" = "+numero);
           //return numero;
			}
		}
		return getFatorial();
	}
	
	public double logaritimo_10(long numeros){
		return Math.log10(numeros);
	}
	
}