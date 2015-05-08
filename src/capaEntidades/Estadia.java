package capaEntidades;

public class Estadia {

	String fechaIngreso;
	String fechaEgreso;
	boolean facturada;

	public String getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getFechaEgreso() {
		return fechaEgreso;
	}
	public void setFechaEgreso(String fechaEgreso) {
		this.fechaEgreso = fechaEgreso;
	}
	public boolean isFacturada() {
		return facturada;
	}
	public void setFacturada(boolean facturada) {
		this.facturada = facturada;
	}

}
