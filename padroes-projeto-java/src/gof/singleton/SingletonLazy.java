package gof.singleton;

/*Singleton preguiçoso que nao disponibilza a instancia pro usuario*/

public class SingletonLazy {

	private static SingletonLazy instancia; 
	
	private SingletonLazy() {
		super();
	}
	
	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}
}
