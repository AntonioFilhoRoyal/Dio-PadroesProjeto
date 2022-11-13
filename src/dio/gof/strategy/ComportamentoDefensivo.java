package dio.gof.strategy;

public class ComportamentoDefensivo implements Comportamento{
	
	// Sobrescrevendo o metodo mover() da interface
	@Override
	public void mover() {
		System.out.println("Defensivo");
	}
}
