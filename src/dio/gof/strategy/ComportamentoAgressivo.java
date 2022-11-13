package dio.gof.strategy;

public class ComportamentoAgressivo implements Comportamento{
	
	// Sobrescrevendo o metodo mover() da interface
	@Override
	public void mover() {
		System.out.println("Agressivo");
	}
}
