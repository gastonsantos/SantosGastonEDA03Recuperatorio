package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBatalla;

public class FuerzaArmada {
	private Integer capacidadDeDefensa;
	private Set<Vehiculo> convoy;
	private Map<String, Batalla> batallas;
	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();
		this.batallas = new HashMap<String, Batalla>();
		this.capacidadDeDefensa = 0;
	}
	public void setCapacidadDeDefensa(Integer capacidadDeDefensa) {
		this.capacidadDeDefensa = capacidadDeDefensa;
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
		return convoy.add(vehi);
		
	}

	public Integer getCapacidadDeDefensa() {
		return convoy.size();
	}
	public void crearBatalla(String nombre, TipoDeBatalla terrestre,Double latitud, Double longitud) {
		batallas.put(nombre,new Batalla( longitud, latitud, terrestre));
		
	}
	public Batalla getBatalla(String string) {
		
		return batallas.get(string);
	}
	
	public Batalla buscarBatalla(String nombre) throws BatallaNoExista {
		Batalla bat1 = null;
		
		for(Map.Entry<String, Batalla> entry: batallas.entrySet()) {
			if(entry.getKey().equals(nombre)) {
				bat1 = entry.getValue();
			}
		}
		if(bat1 != null) {
			return bat1;
		}else {
			throw new BatallaNoExista();
		}
	}
	public Vehiculo buscoVehiculo(Integer vehi) throws VehiculoInexistente {
		Vehiculo vehi1 = null;
		for(Vehiculo e: convoy) {
			if(e.getCodigo().equals(vehi)) {
				vehi1 = e;
				break;
			}
		}
		if(vehi1 != null) {
			return vehi1;
		}else {
			throw new VehiculoInexistente();
		}
	}
	
	
	public boolean enviarALaBatalla(String nombre, Integer codigo) throws BatallaNoExista, VehiculoInexistente, VehiculoIncompatible {
		Boolean envio = false;
		Batalla bat1 = buscarBatalla(nombre);
		Vehiculo vehi = buscoVehiculo(codigo);
		
		if(bat1.getTipo().equals(TipoDeBatalla.AEREA)&& vehi instanceof Volador ) {
		bat1.agregoVehiculo(vehi);
		envio = true;
		}if(bat1.getTipo().equals(TipoDeBatalla.NAVAL) && vehi instanceof Acuatico) {
			bat1.agregoVehiculo(vehi);
			envio = true;
		}if(bat1.getTipo().equals(TipoDeBatalla.TERRESTRE) && vehi instanceof Terrestre) {
			bat1.agregoVehiculo(vehi);
			envio = true;
		}else {
			throw new VehiculoIncompatible();
		}
		
		
		
		return envio;
	}
	
	
	
	
	
	
	
}
