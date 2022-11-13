package dio.gof.singleton;

public class SingletonLazy {
	// Cria uma instancia (nome comumente usado)
	private static SingletonLazy instancia;
	
		// Constructor
	private SingletonLazy() {
		super();
	}
	
	/*
	 	Criar uma variavel unica que em todos os metodos e retornam ela
	 	mas de diferentes modos
	 
	 */
		
		// chamada publica que verifica a variavel instaicia
	public static SingletonLazy getInstancia() {
			// caso instancia for null entao cria um objeto e aloca o objeto na instancia
		if(instancia == null)
			instancia = new SingletonLazy();
		return instancia; // retorna o objeto da instancia
	}
	
	/*
	 	Neste caso, o metodo getInstancia esta verificando se instancia esta null(vazio), caso esteja ele retornara um constructor
	 	diferenti disso retornara instacia
	 	
	 */
}




