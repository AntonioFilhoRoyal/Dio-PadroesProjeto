package dio.gof.strategy.myStrategy;

public interface Estado {
	
	void status();
	
	// Digamos que no estado ligado a bateria esteja On e no estado desligado esteja Off
	void bateria();
}
