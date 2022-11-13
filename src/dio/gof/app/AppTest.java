package dio.gof.app;

import dio.gof.singleton.SingletonEager;
import dio.gof.singleton.SingletonLazy;
import dio.gof.strategy.Comportamento;
import dio.gof.strategy.ComportamentoAgressivo;
import dio.gof.strategy.ComportamentoDefensivo;
import dio.gof.strategy.Robo;
import dio.gof.strategy.myStrategy.Celular;
import dio.gof.strategy.myStrategy.Estado;
import dio.gof.strategy.myStrategy.EstadoDesligado;
import dio.gof.strategy.myStrategy.EstadoLigado;

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			// Singleton
		// Chamo o class SingletonLazy nomeVariavel = Class.metodo()
		SingletonLazy singletonLazy = SingletonLazy.getInstancia();
		System.out.println(singletonLazy);
		
		SingletonEager singletonEager = SingletonEager.getEager();
		System.out.println(singletonEager);
	
			// Strategy
		Robo robo = new Robo();
		
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		robo.setComportamento(defensivo);
		robo.mover();
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		
		
			// Minha Strategy
		
		Celular celular = new Celular();
		Estado ligado = new EstadoLigado();
		Estado desligado = new EstadoDesligado();
		
		celular.setEstado(ligado);
		celular.estado();
		celular.setEstado(desligado);
		celular.estado();
		
	}

}
