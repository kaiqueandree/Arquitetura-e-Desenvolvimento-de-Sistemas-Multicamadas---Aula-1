
public abstract class Poligono extends Figura {

	double largura;
	double altura;
	
	public Poligono(double largura, double altura) {
		this.largura = largura;
		this.altura = altura;
	}
	
	
	public double getLargura() {
		return largura;
	}
	public void setLargura(double largura) {
		this.largura = largura;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
		
}
