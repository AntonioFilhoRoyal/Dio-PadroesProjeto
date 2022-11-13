package dio.gof.strategy;

public class Robo {
	
		// Implementa a interface
	private Comportamento comportamento;
		// Interface nomeVariavel;
	
	// Set de comportamento
	public void setComportamento(Comportamento comportamento) {
							//	tipo nome
		this.comportamento = comportamento;
	}
	
	public void mover() {
		// nomeVariavel
		comportamento.mover();
	}
	
	// Class robo que importa a interface Comporamento, set um modo de comportamento e criar um metodo mover
	// dentro do metodo, pega o this que esta no set e passa um metodo da interface Comportamento
	
}
