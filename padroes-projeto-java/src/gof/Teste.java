package gof;

import gof.facade.Facade;
import gof.singleton.SingletonEager;
import gof.singleton.SingletonLazy;
import gof.singleton.SingletonLazyHolder;
import gof.strategy.Comportamento;
import gof.strategy.ComportamentoAgressivo;
import gof.strategy.ComportamentoDefensivo;
import gof.strategy.ComportamentoNormal;
import gof.strategy.Robo;

public class Teste {

	public static void main(String[] args) {
		
		//Testes relacionados ao Design Pattern Singleton:
		//O que muda é a forma e o modo de pegar essa instancia.
	
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		lazyHolder = SingletonLazyHolder.getInstancia();
		System.out.println(lazyHolder);
		
		// Strategy - pode ser usada quando quer fazer uma variacao de uma determinada implementacao.
		//Usa bastante o conceito de polimorfismo.
		
				Comportamento defensivo = new ComportamentoDefensivo();
				Comportamento normal = new ComportamentoNormal();
				Comportamento agressivo = new ComportamentoAgressivo();

				Robo robo = new Robo();
				robo.setComportamento(normal);
				robo.mover();
				robo.setComportamento(agressivo);
				robo.mover();
				robo.mover();
				robo.setComportamento(defensivo);
				robo.mover();
				
				//Facade
				
				Facade facade = new Facade();
				facade.migrarCliente("Henrique", "65000-000");
				

	}		
	
}
