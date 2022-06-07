
public class Circulo implements FormaGeometrica {
	private float raio;
	private float perimetro;
	
	public Circulo() {
		raio = 1;
		
	}
	
	
	public Circulo(float raio) {
		this.raio = raio;
		
	}
	public float calculoPerimetro() {
		return 2*3.14f*raio;
		
	}
	
	public float calculoArea() {
		return 3.14f*raio*raio;
		
		
	}
}
	