package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FuerzaArmada {

	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
	}
	public Set<Vehiculo> getConvoy() {
		return convoy;
	}
	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}
	public Map<String, Batalla> getBatallas() {
		return batallas;
	}
	public void setBatallas(Map<String, Batalla> batallas) {
		this.batallas = batallas;
	} 

	public Boolean agregarVehiculo(Vehiculo vehi) {
		
	
		
		
	}
	
	
}
