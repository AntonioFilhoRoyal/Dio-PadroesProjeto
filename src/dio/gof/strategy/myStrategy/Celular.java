package dio.gof.strategy.myStrategy;

public class Celular {
	private Estado estado;

	
	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void status() {
		estado.status();
	}
	
	public void bateria() {
		estado.bateria();
	}
	
	public void estado() {
		estado.status();
		estado.bateria();
	}
}
