package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre {
	
	public Double velocidad;
	public Tanque(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad = 0.0;
	}

	@Override
	public double getVelocidad() {
		// TODO Auto-generated method stub
		return velocidad;
	}

	
}
