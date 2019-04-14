
public class Quadrado extends Poligono implements Diagonal{

	public Quadrado(double largura, double altura) {
		super(largura, altura);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaDiagonal() {
		return Math.sqrt(Math.pow(altura, 2)+Math.pow(largura, 2));
	}

		// TODO Auto-generated method stub
	
	@Override
	public double area() {
		// TODO Auto-generated method stub
		return super.largura*super.altura;
	}

}
