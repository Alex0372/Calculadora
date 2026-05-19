public class Calculadora {
	
	//Añado metodo sumar
	public int sumar(int a, int b) {
		return a + b;
	}
	
	//Añado metodo restar
	public int restar(int a, int b) {
		return a - b;
	}
	
	//Añado metodo multiplicar
	public int multiplicar(int a, int b) {
		return a * b;
	}
	
	//Añado metodo dividir
	public double dividir(int a, int b) {
		if (b == 0) {
			throw new IllegalArgumentException("No se puede dividir entre cero");
		}
		return (double) a / b;
	}
}