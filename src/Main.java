
public class Main {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(4);
		Retangulo retangulo = new Retangulo(4,0);
		Circulo circulo = new Circulo(3.14f);
		
		System.out.println("Os lados do quadrado s�o: " + quadrado.lado1);
		System.out.println("Os lados do ret�ngulo s�o: " + retangulo.lado1 + " " + retangulo.lado2);
		System.out.println("O raio do c�rculo �: " + circulo.calculoPerimetro());
		System.out.println("O per�metro do quadrado �: "+ quadrado.calculoPerimetro());
		System.out.println("O per�metro do ret�ngulo �: " + retangulo.calculoPerimetro());
		System.out.println("O per�metro do c�rculo �: " + circulo.calculoPerimetro());	
		System.out.println("A �rea do quadrado �: "+ quadrado.calculoArea());
		System.out.println("A �rea do ret�ngulo �: "+ retangulo.calculoArea());
		System.out.println("A �rea do c�rculo �: " + circulo.calculoArea());
		
		
		
		
		
		
		
		}

	}

