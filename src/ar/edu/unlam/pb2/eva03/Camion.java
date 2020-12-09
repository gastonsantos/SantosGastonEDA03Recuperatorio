package ar.edu.unlam.pb2.eva03;

public class Camion  extends Vehiculo implements Terrestre{
	
	private Double velocidad;
	public Camion(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad = 0.0;
	}

	@Override
	public double getVelocidad() {
		return velocidad;
	}

	
}
