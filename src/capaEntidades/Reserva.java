package capaEntidades;

public class Reserva {
	
		String fechaFin;
		String fechaCancelacion;
		boolean estado;
		String fechaInicio;
		
		public String getFechaInicio() {
			return fechaInicio;
		}
		public void setFechaInicio(String fechaInicio) {
			this.fechaInicio = fechaInicio;
		}
		public String getFechaFin() {
			return fechaFin;
		}
		public void setFechaFin(String fechaFin) {
			this.fechaFin = fechaFin;
		}
		public String getFechaCancelacion() {
			return fechaCancelacion;
		}
		public void setFechaCancelacion(String fechaCancelacion) {
			this.fechaCancelacion = fechaCancelacion;
		}
		public boolean isEstado() {
			return estado;
		}
		public void setEstado(boolean estado) {
			this.estado = estado;
		}
	
		
		
		
		
}
