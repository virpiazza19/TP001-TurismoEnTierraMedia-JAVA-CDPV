package tierraMedia;

import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Usuario { //PUSE QUE EXTIENDE SOLO PARA QUE NO ME MARQUE ERROR EL ORDENADOR
	
	private List <Usuario> usuarios = new LinkedList<Usuario>();
	
	private String nombre;
	private int presupuesto;
	private double tiempoDisponible;
	private TipoAtraccion atraccionPreferida;
	private String []itinerario; //NO SE SI ES UN ARRAY SIMPLE, PUEDE SER UNA LISTA TAMBIEN
	
	
	public Usuario(String nombre, int presupuesto, double tiempoDisponible, TipoAtraccion atraccionPreferida) {
		this.nombre = nombre;
		this.presupuesto = presupuesto;
		this.tiempoDisponible = tiempoDisponible;
		this.atraccionPreferida = atraccionPreferida;
	}
	public String getNombre() {
		return nombre;
	}
	public int getPresupuesto() {
		return presupuesto;
	}
	public double getTiempoDisponible() {
		return tiempoDisponible;
	}
	public TipoAtraccion getAtraccionPreferida() {
		return atraccionPreferida;
	}
	public String[] getItinerario() {
		return itinerario;
	}

	public void ordenarPorTipoAtraccion() { //NO SE SI ESTA BIEN DECLARARLA DEVUELTA ACA
		List <Producto> ofertas = new ArrayList<Producto>();
		ofertas.sort(new ComparadorPorTipoAtraccion(atraccionPreferida));
	}

	public void contratarPromocion() { 
		this.ordenarPorTipoAtraccion(); //FALTA!!!
		
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", presupuesto=" + presupuesto + ", tiempoDisponible="
				+ tiempoDisponible + ", atraccionPreferida=" + atraccionPreferida + "]";
	}
	
	protected void agregarUsuario(Usuario UU) { //Agrega cada objeto de usuario (cada cada) a la lista gral de productos
		usuarios.add(UU);
	}
	
	
}
