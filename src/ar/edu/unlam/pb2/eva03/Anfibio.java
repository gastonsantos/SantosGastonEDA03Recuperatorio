package ar.edu.unlam.pb2.eva03;

public class Anfibio extends Vehiculo implements Terrestre, Acuatico {

	private Double profundidad;
	private Double velocidad;
	public Anfibio(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
		this.velocidad= 0.0;
	}

	@Override
	public double getProfundidad() {
		
		return profundidad;
	}

	@Override
	public double getVelocidad() {
		
		return velocidad;
	}

	
	
}
