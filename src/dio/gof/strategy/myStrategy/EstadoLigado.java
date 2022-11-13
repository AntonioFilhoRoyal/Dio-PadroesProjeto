package dio.gof.strategy.myStrategy;

public class EstadoLigado implements Estado{

	@Override
	public void status() {
		System.out.println("Ligado");
	}
	
	@Override
	public void bateria() {
		System.out.println("On");
	}
}
