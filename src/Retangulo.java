
public class Retangulo extends Quadrilatero{
	
	private float base;
	private float altura;
	
	
	public Retangulo(float base, float altura) {
		lado1 = base;
		lado2 = altura;
		lado3 = base;
		lado4 = altura;
		this.base = base;
		this.altura = altura;		
		
	}
	public float calculoArea() {
		return base*altura;
		
	}
	
}
