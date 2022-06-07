
public class Main {

	public static void main(String[] args) {
		Quadrado quadrado = new Quadrado(4);
		Retangulo retangulo = new Retangulo(4,0);
		Circulo circulo = new Circulo(3.14f);
		
		System.out.println("Os lados do quadrado são: " + quadrado.lado1);
		System.out.println("Os lados do retângulo são: " + retangulo.lado1 + " " + retangulo.lado2);
		System.out.println("O raio do círculo é: " + circulo.calculoPerimetro());
		System.out.println("O perímetro do quadrado é: "+ quadrado.calculoPerimetro());
		System.out.println("O perímetro do retângulo é: " + retangulo.calculoPerimetro());
		System.out.println("O perímetro do círculo é: " + circulo.calculoPerimetro());	
		System.out.println("A área do quadrado é: "+ quadrado.calculoArea());
		System.out.println("A área do retângulo é: "+ retangulo.calculoArea());
		System.out.println("A área do círculo é: " + circulo.calculoArea());
		
		
		
		
		
		
		
		}

	}

