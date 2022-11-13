package dio.gof.strategy.myStrategy;

public class EstadoDesligado implements Estado{

	@Override
	public void status() {
		System.out.println("Desigado");
	}
	
	@Override
	public void bateria() {
		System.out.println("Off");
	}
}
