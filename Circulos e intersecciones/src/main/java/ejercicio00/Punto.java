package ejercicio00;

public class Punto {

	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distancia(Punto punto) {
	    double dx = this.x - punto.x;
	    double dy = this.y - punto.y;
	    return Math.hypot(dx, dy);
	}
}

