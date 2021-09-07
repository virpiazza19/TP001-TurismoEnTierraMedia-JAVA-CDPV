package tierraMedia;

import java.util.ArrayList;
import java.util.List;

public abstract class Producto {

	protected List<Atraccion> atracciones = new ArrayList<Atraccion>(); // Almacenamos todas las atracciones creadas
	protected List<Promocion> promociones = new ArrayList<Promocion>(); // Almacenamos todas las promos creadas
	protected TipoAtraccion tipoAtraccion;
	protected String nombre;
	protected int costo;
	protected double duracion;
	
	public String getNombre() {
		return nombre;
	}

	public int getCosto() {
		return costo;
	}

	public double getDuracion() {
		return duracion;
	}
	public TipoAtraccion getTipoAtraccion() {
		return tipoAtraccion;
	}
	
	protected boolean esPromo() {
		return false;
	}
	
	// Metodos que usariamos en el lector
	public void agregarAtraccion(Atraccion a) {
		this.atracciones.add(a);
	}
	
	public void agregarPromocion(Promocion p) {
		this.promociones.add(p);
	}
}