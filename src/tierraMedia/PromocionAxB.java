package tierraMedia;

public class PromocionAxB extends Promocion {

	private Atraccion atraccionBonificada;

	public PromocionAxB(TipoPromocion tipoPromo, TipoAtraccion atraccionPreferida, int costo, double duracion,
			Atraccion a1, Atraccion a2, Atraccion atraccionBonificada) {
		super(tipoPromo, atraccionPreferida, costo, duracion);
		super.atraccionesEnPromocion = new Atraccion[] { a1, a2, atraccionBonificada };
		this.atraccionBonificada = atraccionBonificada;
	}

	@Override
	protected int costoPromocion() {
		int costo = 0;
		for (int i = 0; i < atraccionesEnPromocion.length - 1; i++) {
			costo += atraccionesEnPromocion[i].costo;
		}
		return costo - atraccionBonificada.costo;
	}
}
